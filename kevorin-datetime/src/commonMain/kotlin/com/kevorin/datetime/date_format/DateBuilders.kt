package com.kevorin.datetime.date_format

import kotlinx.datetime.LocalDateTime

/**
 * Utility helpers optimized for speed.
 *
 * Avoids:
 * - String.format (slow & allocates memory)
 * Uses:
 * - Simple string templates
 * - Minimal temporary objects
 */


// Ensures two-digit formatting (01–09)
internal fun two(n: Int) = if (n < 10) "0$n" else "$n"


// ISO date: YYYY-MM-DD
internal fun buildIsoDate(l: LocalDateTime) =
    "${l.date.year}-${two(l.date.monthNumber)}-${two(l.date.day)}"


// ISO date-time: YYYY-MM-DD HH:MM:SS
internal fun buildIsoDateTime(l: LocalDateTime) =
    "${l.date.year}-${two(l.date.monthNumber)}-${two(l.date.day)} " +
            "${two(l.hour)}:${two(l.minute)}:${two(l.second)}"


// DD-MM-YYYY
internal fun buildDDMMYYYY(l: LocalDateTime, sep: Char) =
    "${two(l.date.day)}$sep${two(l.date.monthNumber)}$sep${l.date.year}"


// MM-DD-YYYY
internal fun buildMMDDYYYY(l: LocalDateTime, sep: Char) =
    "${two(l.date.monthNumber)}$sep${two(l.date.day)}$sep${l.date.year}"


// YYYY-MM-DD
internal fun buildYYYYMMDD(l: LocalDateTime, sep: Char) =
    "${l.date.year}$sep${two(l.date.monthNumber)}$sep${two(l.date.day)}"
