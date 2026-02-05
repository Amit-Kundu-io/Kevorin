package com.kevorin.datetime.time_format



import com.kevorin.datetime.date_format.systemTimeZone
import kotlinx.datetime.*
import kotlin.time.Clock


/**
 * Internal high-performance time formatter.
 * Mirrors KevorinDateEngine architecture.
 */
internal class KevorinTimeEngine {

    /** Cache of TimeZone objects */
    private val zoneCache = mutableMapOf<String, TimeZone>()

    /** Get cached timezone */
    private fun zone(id: String): TimeZone =
        zoneCache.getOrPut(id) { TimeZone.of(id) }

    fun now(
        format: TimeFormat,
        timeZoneId: String? = null
    ): String {
        val local = Clock.System.now()
            .toLocalDateTime(zone(timeZoneId ?: systemTimeZone()))

        return format(local, format)
    }

    fun format(epochSeconds: Long, format: TimeFormat, timeZoneId: String?): String {
        if (format.code == 5) {
            // RELATIVE
            return buildRelative(epochSeconds)
        }

        val local = Instant.fromEpochSeconds(epochSeconds)
            .toLocalDateTime(zone(timeZoneId ?: systemTimeZone()))
        return format(local, format)
    }

    // ---------- dispatcher ----------

    private fun format(local: LocalDateTime, format: TimeFormat): String =
        when (format.code) {
            1 -> buildHHMM(local)
            2 -> buildHHMMSS(local)
            3 -> buildHHMM_A(local)
            4 -> buildHHMMSS_A(local)
            else -> error("Unsupported TimeFormat code: ${format.code}")
        }
}
