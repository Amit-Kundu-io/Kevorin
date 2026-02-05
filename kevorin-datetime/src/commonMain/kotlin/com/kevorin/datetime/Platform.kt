package com.kevorin.datetime

import com.kevorin.datetime.date_format.KevorinDateFormat
import com.kevorin.datetime.date_format.KevorinDate
import com.kevorin.datetime.time_format.KevorinTimeFormat
import com.kevorin.datetime.time_format.TimeFormat

expect fun platform(): String

fun date (){

     KevorinDateFormat.format(epochSeconds = 13132132, format = KevorinDate.DD_MMM_YYYY)
     KevorinTimeFormat.format(123132132132, TimeFormat.HH_MM_A)

}