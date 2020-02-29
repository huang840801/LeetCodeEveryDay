package com.guanhong.leetcodeeveryday

class LeetCode581 {

    fun findUnsortedSubarray(nums : IntArray) : Int {

        if (nums.count() == 0) return 0
        if (nums.count() == 1) return 0

        val minIndexOfArray = nums.indexOf(nums.min()!!)
        val maxIndexOfArray = nums.lastIndexOf(nums.max()!!)

        val isMinNumArrayFirst = minIndexOfArray == 0
        val isMaxNumArrayLast = maxIndexOfArray == nums.count() - 1

        if (!isMinNumArrayFirst && !isMaxNumArrayLast) {

            return nums.count()
        }

        val unsortedSubarrayFirstIndex = if (isMinNumArrayFirst) {

            1
        } else {
            0
        }

        val unsortedSubarrayLastIndex = if (isMaxNumArrayLast) {

            nums.count() - 2
        } else {
            nums.count() - 1
        }

        val intArray = IntArray(
            if (isMinNumArrayFirst && isMaxNumArrayLast) {
                nums.count() - 2
            } else {
                nums.count() - 1
            }
        )

        for ((index, i) in (unsortedSubarrayFirstIndex..unsortedSubarrayLastIndex).withIndex()) {

            intArray[index] = nums[i]
        }

        return findUnsortedSubarray(intArray)
    }
}