package com.guanhong.leetcodeeveryday.easy

import kotlin.math.max

class LeetCode643 {

    fun findMaxAverage(nums : IntArray, k : Int) : Double {

        var maxSum = 0

        for (i in 0 until k) {

            maxSum += nums[i]
        }

        var answer = maxSum

        for (i in 0 until nums.count() - k) {

            maxSum = maxSum - nums[i] + nums[i + k]
            answer = max(answer, maxSum)
        }

        return (answer.toDouble() / k.toDouble())
    }
}