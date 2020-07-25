package com.guanhong.leetcodeeveryday.easy

class LeetCode1480 {

    fun runningSum(nums : IntArray) : IntArray {

        var sum = 0

        val answer = IntArray(nums.count())

        nums.forEachIndexed { index, num ->

            answer[index] = num + sum

            sum += num
        }

        return answer
    }
}