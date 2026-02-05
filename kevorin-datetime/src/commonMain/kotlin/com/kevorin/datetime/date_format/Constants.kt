package com.kevorin.datetime.date_format

/**
 * Static month names stored in array to avoid
 * repeated list allocations → improves performance.
 */
internal val MONTH_SHORT = arrayOf(
    "Jan","Feb","Mar","Apr","May","Jun",
    "Jul","Aug","Sep","Oct","Nov","Dec"
)

internal val MONTH_FULL = arrayOf(
    "January","February","March","April","May","June",
    "July","August","September","October","November","December"
)