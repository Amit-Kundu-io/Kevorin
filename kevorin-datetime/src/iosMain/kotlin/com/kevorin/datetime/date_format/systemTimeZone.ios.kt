package com.kevorin.datetime.date_format

import platform.Foundation.NSTimeZone
import platform.Foundation.systemTimeZone

actual fun systemTimeZone(): String = NSTimeZone.systemTimeZone.name