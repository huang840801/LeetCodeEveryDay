package com.guanhong.leetcodeeveryday

class LeetCode788 {

    fun rotatedDigits(N : Int) : Int {

        var answer = 0

        for (n in 2..N) {

            if (isValid(n)) {

                answer++
            }
        }

        return answer
    }

    fun isValid(N : Int) : Boolean {

        val string = N.toString()

        var isGood = false

        string.forEach {

            if (it == '3' || it == '4' || it == '7') {

                return false
            }

            if (it == '2' || it == '5' || it == '6' || it == '9') {

                isGood = true
            }
        }

        return isGood
    }
}