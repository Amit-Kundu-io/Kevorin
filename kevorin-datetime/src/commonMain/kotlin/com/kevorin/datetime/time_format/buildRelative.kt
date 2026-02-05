package com.kevorin.datetime.time_format


import kotlin.time.Clock

/**
 * Ultra-fast relative time calculator.
 *
 * Design:
 * - Primitive math only
 * - No LocalDateTime
 * - No allocations except final String
 */
internal fun buildRelative(epochSeconds: Long): String {

    val diff = Clock.System.now().epochSeconds - epochSeconds

    // seconds
    if (diff < 60) return "just now"

    // minutes
    val minutes = diff / 60
    if (minutes < 60) {
        return if (minutes == 1L) "1 min ago"
        else "$minutes min ago"
    }

    // hours
    val hours = minutes / 60
    if (hours < 24) {
        return if (hours == 1L) "1 hr ago"
        else "$hours hrs ago"
    }

    // days
    val days = hours / 24

    return when (days) {
        1L -> "Yesterday"
        else -> "$days days ago"
    }
}
