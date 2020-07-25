package com.guanhong.leetcodeeveryday.medium

class LeetCode33 {

    fun search(nums : IntArray, target : Int) : Int {

        if (nums.isEmpty()) {
            return -1
        }

        val maxIndex = nums.indexOf(nums.max()!!)

        val toList = nums.toList()

        val bigSubList = toList.subList(0, maxIndex + 1)
        val smallSubList = toList.subList(maxIndex + 1, nums.count())

        val targetIndexInBigSubList = binarySearch(bigSubList, target)

        return if (targetIndexInBigSubList == -1) {

            val targetIndexInSmallSubList = binarySearch(smallSubList, target)

            if (targetIndexInSmallSubList == -1) {

                -1
            } else {

                bigSubList.count() + targetIndexInSmallSubList
            }
        } else {

            targetIndexInBigSubList
        }
    }

    private fun binarySearch(nums : List<Int>, target : Int) : Int {

        if (nums.isEmpty()) {
            return -1
        }

        var rightIndex = nums.lastIndex
        var leftIndex = 0

        while (leftIndex <= rightIndex) {

            val middleIndex = (leftIndex + rightIndex) / 2

            if (nums[middleIndex] == target) {

                return middleIndex
            }

            if (nums[middleIndex] > target) {

                rightIndex = middleIndex - 1
            } else {

                leftIndex = middleIndex + 1
            }
        }

        return -1
    }
}