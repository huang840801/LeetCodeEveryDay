package com.guanhong.leetcodeeveryday

class LeetCode168 {

    fun convertToTitle(n : Int) : String {

        return if (n <= 0) ""
        else resursion(n, "")
    }

    // n >= 0
    fun resursion(n : Int, s : String) : String {

        var temp = s

        return if (n < 27) {

            transTitle(n) + s
        } else {

            temp = transTitle(n % 26) + temp

            if (n % 26 == 0) {

                resursion((n / 26 - 1), temp)
            } else {

                resursion((n / 26), temp)
            }
        }
    }

    fun transTitle(n : Int) : String {

        return when (n) {
            1 -> "A"
            2 -> "B"
            3 -> "C"
            4 -> "D"
            5 -> "E"
            6 -> "F"
            7 -> "G"
            8 -> "H"
            9 -> "I"
            10 -> "J"
            11 -> "K"
            12 -> "L"
            13 -> "M"
            14 -> "N"
            15 -> "O"
            16 -> "P"
            17 -> "Q"
            18 -> "R"
            19 -> "S"
            20 -> "T"
            21 -> "U"
            22 -> "V"
            23 -> "W"
            24 -> "X"
            25 -> "Y"
            26 -> "Z"
            0 -> "Z"
            else -> ""
        }
    }
}