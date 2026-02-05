package com.kevorin.datetime.date_format


import kotlinx.datetime.*

/**
 * Internal formatting engine.
 *
 * Responsibilities:
 * - Convert epoch → LocalDateTime
 * - Cache TimeZone objects (performance)
 * - Delegate formatting using lightweight switch
 */
internal class KevorinDateEngine {


    /**
     * Cache to avoid repeatedly creating TimeZone objects.
     * TimeZone creation is expensive, so we reuse instances.
     */
    private val zoneCache = mutableMapOf<String, TimeZone>()


    fun format(epoch: Long, format: KevorinDate, zoneId: String?): String {


        // Use provided zone or fallback to system timezone
        val id = zoneId ?: systemTimeZone()


        // Reuse cached timezone for speed & low memory
        val zone = zoneCache.getOrPut(id) { TimeZone.of(id) }


        // Convert epoch seconds → local date/time
        val local = Instant.fromEpochSeconds(epoch).toLocalDateTime(zone)


        // Ultra‑fast switch using primitive code
        return when (format.code) {

            // ================= ISO / TECHNICAL =================

            1 -> buildIsoDate(local)
            // Example: 2026-01-10

            2 -> buildIsoDateTime(local)
            // Example: 2026-01-10 14:30:25

            3 -> Instant.fromEpochSeconds(epoch).toString()
            // Example: 2026-01-10T14:30:25Z


            // ================= NUMERIC REGIONAL =================

            4 -> buildDDMMYYYY(local, '-')
            // Example: 10-01-2026  (India, Europe)

            5 -> buildMMDDYYYY(local, '-')
            // Example: 01-10-2026  (USA)

            6 -> buildYYYYMMDD(local, '-')
            // Example: 2026-01-10  (ISO numeric)

            7 -> buildDDMMYYYY(local, '/')
            // Example: 10/01/2026

            8 -> buildMMDDYYYY(local, '/')
            // Example: 01/10/2026

            9 -> buildDDMMYYYY(local, '.')
            // Example: 10.01.2026  (Germany, EU)


            // ================= TEXT MONTH =================

            10 -> "${two(local.date.day)} ${MONTH_SHORT[local.date.month.number - 1]} ${local.date.year}"
            // Example: 10 Jan 2026

            11 -> "${two(local.date.day)} ${MONTH_FULL[local.date.month.number - 1]} ${local.date.year}"
            // Example: 10 January 2026

            12 -> "${MONTH_SHORT[local.date.month.number - 1]} ${two(local.date.day)}, ${local.date.year}"
            // Example: Jan 10, 2026

            13 -> "${MONTH_FULL[local.date.month.number - 1]} ${two(local.date.day)}, ${local.date.year}"
            // Example: January 10, 2026

            14 -> "${MONTH_SHORT[local.date.month.number - 1]} ${two(local.date.day)}"
            // Example: Jan 10

            15 -> "${MONTH_FULL[local.date.month.number - 1]} ${two(local.date.day)}"
            // Example: January 10


            else -> error("Unsupported DateFormat code: ${format.code}")
        }
    }
}