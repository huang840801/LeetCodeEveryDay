package com.guanhong.leetcodeeveryday

class LeetCode168 {

    fun convertToTitle(n : Int) : String {

        return resursion(n, "")
    }

    fun resursion(n : Int, s : String) : String {

        var temp = s

        return if (n < 27) {

            transTitle((n - 1)) + s
        } else {

            temp = transTitle((n - 1) % 26) + temp

            resursion((n - 1) / 26, temp)
        }
    }

    fun transTitle(n : Int) : String {

        return when (n) {
            0 -> "A"
            1 -> "B"
            2 -> "C"
            3 -> "D"
            4 -> "E"
            5 -> "F"
            6 -> "G"
            7 -> "H"
            8 -> "I"
            9 -> "J"
            10 -> "K"
            11 -> "L"
            12 -> "M"
            13 -> "N"
            14 -> "O"
            15 -> "P"
            16 -> "Q"
            17 -> "R"
            18 -> "S"
            19 -> "T"
            20 -> "U"
            21 -> "V"
            22 -> "W"
            23 -> "X"
            24 -> "Y"
            25 -> "Z"
            else -> ""
        }
    }
}