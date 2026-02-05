package com.kevorin.datetime.time_format


/**
 * Uses primitive Int → lowest RAM & fastest switch.
 */
value class TimeFormat private constructor(val code: Int) {

    companion object {

        // ===== 24-hour =====

        /** 14:30 */
        val HH_MM = TimeFormat(1)

        /** 14:30:25 */
        val HH_MM_SS = TimeFormat(2)

        // ===== 12-hour =====

        /** 02:30 PM */
        val HH_MM_A = TimeFormat(3)

        /** 02:30:25 PM */
        val HH_MM_SS_A = TimeFormat(4)

        // ===== RELATIVE TIME =====

        /** Auto relative time: "5 min ago", "Yesterday", etc. */
        val RELATIVE = TimeFormat(5)
    }
}
