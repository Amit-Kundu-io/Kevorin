package com.kevorin.datetime.date_format


/**
 * Public API used by apps.
 * Keeps engine internal and stable.
 */
object KevorinDateFormat {

    private val engine = KevorinDateEngine()

    /**
     * Format epoch seconds → date string.
     */
    fun format(
        epochSeconds: Long,
        format: KevorinDate,
        timeZoneId: String? = null
    ): String {
        return engine.format(epochSeconds, format, timeZoneId)
    }
}