package com.kevorin.datetime.time_format


/**
 * Public API for time formatting.
 * Apps should use THIS, not the engine.
 */
object KevorinTimeFormat {

    private val engine = KevorinTimeEngine()

    /** Current time */
    fun now(
        format: TimeFormat,
        timeZoneId: String? = null
    ): String = engine.now(format, timeZoneId)

    /** Epoch → formatted time */
    fun format(
        epoch: Long, // 10 digits
        format: TimeFormat,
        timeZoneId: String? = null
    ): String = engine.format(epoch, format, timeZoneId)
}
