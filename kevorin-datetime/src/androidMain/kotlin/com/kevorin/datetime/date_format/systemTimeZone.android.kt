package com.kevorin.datetime.date_format

actual fun systemTimeZone(): String = java.util.TimeZone.getDefault().id