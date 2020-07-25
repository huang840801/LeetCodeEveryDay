package com.guanhong.leetcodeeveryday.easy

class LeetCode1018 {

    fun prefixesDivBy5(A : IntArray) : BooleanArray {

        val ans = BooleanArray(A.size)
        var sum = 0

        for ((index, i) in A.withIndex()) {

            sum = sum shl 1

            sum += i

            sum %= 5

            ans[index] = sum == 0
        }
        return ans
    }
}