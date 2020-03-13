package com.guanhong.leetcodeeveryday

class LeetCode674 {

    fun findLengthOfLCIS(nums : IntArray) : Int {

        if (nums.isEmpty()) return 0

        var maxLength = 1
        var answer = 1

        for (index in 1 until nums.count()) {

            if (nums[index] > nums[index - 1]) {

                maxLength++

                if (maxLength > answer) {

                    answer = maxLength
                }
            } else {

                maxLength = 1
            }
        }

        return answer
    }
}