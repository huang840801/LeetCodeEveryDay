package com.guanhong.leetcodeeveryday

class LeetCode405 {

    fun toHex(num : Int) : String {

        return if (num < 0) helper(num.toLong())
        else {

            return if (num < 16) {

                numToHex(num)
            } else {

                toHex(num / 16) + toHex(num % 16)
            }
        }
    }

    fun helper(num : Long) : String {

        var thisNum = num

        if (thisNum < 0) {

            val max = 4294967296L
            thisNum += max
        }

        return if (thisNum < 16) {
            when (thisNum) {
                15L -> "f"
                14L -> "e"
                13L -> "d"
                12L -> "c"
                11L -> "b"
                10L -> "a"
                else -> thisNum.toString() + ""
            }
        } else helper(thisNum / 16) + helper(thisNum % 16)
    }

    fun numToHex(num : Int) : String {

        return when ((num) % 16) {
            0 -> "0"
            1 -> "1"
            2 -> "2"
            3 -> "3"
            4 -> "4"
            5 -> "5"
            6 -> "6"
            7 -> "7"
            8 -> "8"
            9 -> "9"
            10 -> "a"
            11 -> "b"
            12 -> "c"
            13 -> "d"
            14 -> "e"
            15 -> "f"
            else -> ""
        }
    }
}