package com.guanhong.leetcodeeveryday.easy

class LeetCode1556 {

    fun thousandSeparator(n : Int) : String {

        val toString = n.toString()

        var answer = ""

        var point = 0

        for (index in toString.count() - 1 downTo 0) {

            if (point == 3) {

                answer = ".$answer"
                point = 0
            }

            point++

            answer = toString[index] + answer
        }

        return answer
    }
}