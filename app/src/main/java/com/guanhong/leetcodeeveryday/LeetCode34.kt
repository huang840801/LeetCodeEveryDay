package com.guanhong.leetcodeeveryday

class LeetCode34 {

    fun searchRange(nums : IntArray, target : Int) : IntArray {

        val indexOfTarget = binarySearch(nums, target)

        if (indexOfTarget == -1) {

            return intArrayOf(-1, -1)
        } else {

            var leftIndex = indexOfTarget
            var rightIndex = indexOfTarget

            while (leftIndex - 1 >= 0 && nums[leftIndex - 1] == target) {

                leftIndex -= 1
            }

            while (rightIndex + 1 <= nums.lastIndex && nums[rightIndex + 1] == target) {

                rightIndex += 1
            }

            return intArrayOf(leftIndex, rightIndex)
        }
    }

    fun binarySearch(nums : IntArray, target : Int) : Int {

        var leftIndex = 0
        var rightIndex = nums.lastIndex

        while (leftIndex <= rightIndex) {

            val middleIndex = (leftIndex + rightIndex) / 2

            if (nums[middleIndex] == target) {

                return middleIndex
            }
            if (nums[middleIndex] < target) {

                leftIndex = middleIndex + 1
            } else {

                rightIndex = middleIndex - 1
            }
        }

        return -1
    }
}