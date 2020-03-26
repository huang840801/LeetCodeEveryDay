package com.guanhong.leetcodeeveryday

class LeetCode724 {

    fun pivotIndex(nums : IntArray) : Int {

        if (nums.count() < 3) return -1
        var startSum = 0
        var endSum = nums.sum() - nums[0]

        var index = 0

        while (index != nums.count()) {

            if (startSum == endSum) {

                return index
            } else {

                startSum += nums[index]

                if (index == nums.count() - 1) {

                    endSum = 0
                } else {

                    endSum -= nums[index + 1]
                }

                index++
            }
        }

        return -1
    }
}