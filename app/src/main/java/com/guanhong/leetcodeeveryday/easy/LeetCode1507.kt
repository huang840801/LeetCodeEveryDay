package com.guanhong.leetcodeeveryday.easy

class LeetCode1507 {

    fun reformatDate(date : String) : String {

        val dateList = date.split(" ")

        val year = dateList[2]
        val month = when (dateList[1]) {
            "Jan" -> "01"
            "Feb" -> "02"
            "Mar" -> "03"
            "Apr" -> "04"
            "May" -> "05"
            "Jun" -> "06"
            "Jul" -> "07"
            "Aug" -> "08"
            "Sep" -> "09"
            "Oct" -> "10"
            "Nov" -> "11"
            "Dec" -> "12"
            else -> ""
        }
        val day = if (dateList[0].count() == 3) {

            "0${dateList[0].substring(0..0)}"
        } else {

            dateList[0].substring(0..1)
        }

        return "$year-$month-$day"
    }
}