package com.guanhong.leetcodeeveryday.easy

class LeetCode1502 {

    fun canMakeArithmeticProgression(arr : IntArray) : Boolean {

        val sortedArray = arr.sorted()

        val diff = sortedArray[1] - sortedArray[0]

        (1..sortedArray.count() - 2).forEach { index ->

            if (sortedArray[index + 1] - sortedArray[index] != diff) {

                return false
            }
        }

        return true
    }
}