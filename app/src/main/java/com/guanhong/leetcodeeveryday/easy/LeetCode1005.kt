package com.guanhong.leetcodeeveryday.easy

class LeetCode1005 {

    fun largestSumAfterKNegations(A : IntArray, K : Int) : Int {

        val sortedList = A.sortedBy { it * it }.toMutableList()

        var k = K

        var index = sortedList.count() - 1

        while (k > 0 && index >= 0) {

            if (sortedList[index] < 0) {

                sortedList[index] = -sortedList[index]
                k--
            }

            index--
        }

        val sum = sortedList.sum()

        return if (k > 0 && k % 2 == 1) {

            sum - 2 * sortedList[0]
        } else {

            sum
        }
    }
}