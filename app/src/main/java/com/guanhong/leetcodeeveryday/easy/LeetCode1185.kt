package com.guanhong.leetcodeeveryday.easy

class LeetCode1185 {

    fun dayOfTheWeek(day : Int, month : Int, year : Int) : String {

        val lowerYear = 1971
        val lowerMonth = 1
        val lowerDay = 1 //Friday

        val yearDiff = year - lowerYear

        var dayOf229Count = 0

        for (indexOfYear in lowerYear until year) {

            if (isLeapYear(indexOfYear)) {

                dayOf229Count += 1
            }
        }

        if (isLeapYear(year) && month > 2) dayOf229Count += 1

        val yearDiffDay = yearDiff * 365

        val monthDiffDay = getMonthDiffDay(month - lowerMonth)

        val dayDiffDay = day - lowerDay

        val totalDayDiff = yearDiffDay + monthDiffDay + dayDiffDay + dayOf229Count

        return getDayOfWeek((totalDayDiff + 5) % 7)
    }

    private fun getDayOfWeek(day : Int) : String {

        return when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            0 -> "Sunday"
            else -> ""
        }
    }

    private fun getMonthDiffDay(monthDiff : Int) : Int {

        val dayOfMonthList = listOf(
            31,
            28,
            31,
            30,
            31,
            30,
            31,
            31,
            30,
            31,
            30,
            31
        )

        var answer = 0

        for (index in 0 until monthDiff) {

            answer += dayOfMonthList[index]
        }

        return answer
    }

    private fun isLeapYear(year : Int) : Boolean {

        return when {

            year % 400 == 0 -> true
            year % 100 == 0 -> false
            year % 4 == 0 -> true
            else -> false
        }
    }
}