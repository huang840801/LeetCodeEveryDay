package com.guanhong.leetcodeeveryday.easy

class LeetCode1154 {

    fun dayOfYear(date : String) : Int {

        val dayOfYearList = date.split("-")

        val year = dayOfYearList[0].toInt()
        val month = dayOfYearList[1].toInt()
        val day = dayOfYearList[2].toInt()

        val isLeapYear = isLeapYear(year)

        var answer = 0

        for (monthIndex in 1 until month) {

            when (monthIndex) {
                1, 3, 5, 7, 8, 10, 12 -> answer += 31
                4, 6, 9, 11 -> answer += 30
                2 -> answer += if (isLeapYear) 29 else 28
                else -> { }
            }
        }

        return answer + day
    }

    fun isLeapYear(year : Int) : Boolean {

        return when {

            year % 400 == 0 -> true
            year % 100 == 0 -> false
            year % 4 == 0 -> true
            else -> false
        }
    }
}