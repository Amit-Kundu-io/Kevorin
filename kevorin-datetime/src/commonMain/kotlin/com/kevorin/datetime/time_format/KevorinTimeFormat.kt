package com.kevorin.datetime.time_format

import com.kevorin.datetime.date_format.systemTimeZone
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Clock
import kotlin.time.Instant


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
        epochSeconds: Long,
        format: TimeFormat,
        timeZoneId: String? = null
    ): String = engine.format(epochSeconds, format, timeZoneId)
}
