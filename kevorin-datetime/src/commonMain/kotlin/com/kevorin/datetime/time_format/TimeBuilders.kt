package com.kevorin.datetime.time_format


import kotlinx.datetime.LocalDateTime

/** Two-digit helper (01-09) */
internal fun two(n: Int) = if (n < 10) "0$n" else "$n"

/** Convert 24-hour → 12-hour */
internal fun hour12(h: Int) = when {
    h == 0 -> 12
    h > 12 -> h - 12
    else -> h
}

/** AM/PM label */
internal fun ampm(h: Int) = if (h < 12) "AM" else "PM"

/** 14:30 */
internal fun buildHHMM(l: LocalDateTime) =
    "${two(l.hour)}:${two(l.minute)}"

/** 14:30:25 */
internal fun buildHHMMSS(l: LocalDateTime) =
    "${two(l.hour)}:${two(l.minute)}:${two(l.second)}"

/** 02:30 PM */
internal fun buildHHMM_A(l: LocalDateTime) =
    "${two(hour12(l.hour))}:${two(l.minute)} ${ampm(l.hour)}"

/** 02:30:25 PM */
internal fun buildHHMMSS_A(l: LocalDateTime) =
    "${two(hour12(l.hour))}:${two(l.minute)}:${two(l.second)} ${ampm(l.hour)}"
