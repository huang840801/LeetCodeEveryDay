package com.guanhong.leetcodeeveryday

class LeetCode665 {

    fun checkPossibility(nums: IntArray): Boolean {

        var modifyChange = 1

        for (i in 1 until nums.size) {

            if (nums[i] < nums[i - 1]) {

                modifyChange -= 1

                if (i == 1 || nums[i - 2] < nums[i]) {
                    nums[i - 1] = nums[i]
                } else {
                    nums[i] = nums[i - 1]
                }
            }

            if (modifyChange < 0) {

                break
            }
        }

        return modifyChange >= 0
    }
}