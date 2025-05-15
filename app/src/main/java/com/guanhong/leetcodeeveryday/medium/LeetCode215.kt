package com.guanhong.leetcodeeveryday.medium

class LeetCode215 {

    fun findKthLargest(nums : IntArray, k : Int) : Int {

        val array = Array(k) { Int.MIN_VALUE }
        for (index in 0 until nums.count()) {
            if (nums[index] > array[0]) {
                array[0] = nums[index]
                for (arrayIndex in 0 until k - 1) {
                    if (array[arrayIndex] > array[arrayIndex + 1]) {
                        val temp = array[arrayIndex]
                        array[arrayIndex] = array[arrayIndex + 1]
                        array[arrayIndex + 1] = temp
                    }
                }
            }
        }
        return array[0]
    }
}