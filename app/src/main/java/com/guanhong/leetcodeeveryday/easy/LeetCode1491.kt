package com.guanhong.leetcodeeveryday.easy

class LeetCode1491 {

    fun average(salary : IntArray) : Double {

        var min = salary.first()
        var max = salary.first()

        var sum = 0
        var count = 0

        salary.forEach {

            if (min > it) {

                min = it
            }

            if (max < it) {

                max = it
            }

            sum += it
            count++
        }

        return ((sum - min - max).toDouble() / (count - 2))
    }
}