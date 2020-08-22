package com.guanhong.leetcodeeveryday.medium

import kotlin.math.max

class LeetCode55 {

    fun canJump(nums : IntArray) : Boolean {

        var reachable = 0

        for (index in 0..nums.lastIndex) {

            if (index > reachable) {

                return false
            }

            reachable = max(reachable, nums[index] + index)
        }

        return true
    }
}