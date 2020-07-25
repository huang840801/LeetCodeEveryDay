package com.guanhong.leetcodeeveryday.easy

class LeetCode189 {

    fun rotate(nums : IntArray, k : Int) : IntArray {

        val numsCount = nums.count()

        val rotateCount = k % numsCount

        reverse(nums, 0, numsCount - 1)
        reverse(nums, 0, rotateCount - 1)
        reverse(nums, rotateCount, numsCount - 1)

        return nums
    }

    fun reverse(nums : IntArray, start : Int, end : Int) : IntArray {

        var startIndex = start
        var endIndex = end

        var temp : Int

        while (startIndex < endIndex) {

            temp = nums[startIndex]
            nums[startIndex] = nums[endIndex]
            nums[endIndex] = temp
            startIndex++
            endIndex--
        }

        return nums
    }
}