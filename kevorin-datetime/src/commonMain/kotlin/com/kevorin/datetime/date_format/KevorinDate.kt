package com.kevorin.datetime.date_format


// ======================================================
// Kevorin DateTime — FINAL COMMENTED PRODUCTION VERSION
// Purpose:
// - Ultra-fast date formatting
// - Very low memory usage
// - Clean public API for library users
// - Easy for contributors to understand & extend
// ======================================================


/**
 * instead of many objects to minimize RAM usage.
 *
 * Why?
 * - Uses only an Int internally → zero extra allocation
 * - Faster comparison in 'when' statements
 * - Suitable for performance-sensitive libraries
 */

value class KevorinDate private constructor(val code: Int) {


    companion object {

        // ================= ISO / TECHNICAL =================

        /** 2026-01-10 */
        val ISO_DATE = KevorinDate(1)

        /** 2026-01-10 14:30:25 */
        val ISO_DATE_TIME = KevorinDate(2)

        /** 2026-01-10T14:30:25Z */
        val ISO_UTC = KevorinDate(3)


        // ================= NUMERIC REGIONAL =================

        /** 10-01-2026 (India, Europe) */
        val DD_MM_YYYY = KevorinDate(4)

        /** 01-10-2026 (USA) */
        val MM_DD_YYYY = KevorinDate(5)

        /** 2026-01-10 (ISO numeric) */
        val YYYY_MM_DD = KevorinDate(6)

        /** 10/01/2026 */
        val DD_MM_YYYY_SLASH = KevorinDate(7)

        /** 01/10/2026 */
        val MM_DD_YYYY_SLASH = KevorinDate(8)

        /** 10.01.2026 (Germany, EU) */
        val DD_MM_YYYY_DOT = KevorinDate(9)


        // ================= TEXT MONTH =================

        /** 10 Jan 2026 */
        val DD_MMM_YYYY = KevorinDate(10)

        /** 10 January 2026 */
        val DD_MMMM_YYYY = KevorinDate(11)

        /** Jan 10, 2026 */
        val MMM_DD_YYYY = KevorinDate(12)

        /** January 10, 2026 */
        val MMMM_DD_YYYY = KevorinDate(13)

        /** Jan 10 */
        val MMM_DD = KevorinDate(14)

        /** January 10 */
        val MMMM_DD = KevorinDate(15)


    }
}