package com.muabdz.moofie.utils

import java.util.concurrent.TimeUnit

object TimeUtils {
    fun getTimeFromMinutes(minutes: Int?): String {
        return if (minutes != null) {
            val hours = TimeUnit.MINUTES.toHours(minutes.toLong())
            val remainingMinutes = minutes - TimeUnit.HOURS.toMinutes(hours)
            if (remainingMinutes > 0)
                "${hours}h${remainingMinutes}m"
            else
                "${hours}h"
        } else {
            ""
        }
    }
}