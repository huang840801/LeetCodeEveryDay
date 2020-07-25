package com.guanhong.leetcodeeveryday.easy

class LeetCode1304 {

    fun sumZero(n : Int) : IntArray {

        if (n == 2) return intArrayOf(-1, 1)

        val answer = IntArray(n)

        var sum = 0

        for (index in 0 until n - 1) {

            answer[index] = index

            sum += index
        }

        answer[n - 1] = -sum

        return answer
    }
}