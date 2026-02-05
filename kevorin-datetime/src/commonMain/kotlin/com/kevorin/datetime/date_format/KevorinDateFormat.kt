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
        epoch: Long, // 10 digits
        format: KevorinDate,
        timeZoneId: String? = null
    ): String {
        return engine.format(epoch, format, timeZoneId)
    }
}