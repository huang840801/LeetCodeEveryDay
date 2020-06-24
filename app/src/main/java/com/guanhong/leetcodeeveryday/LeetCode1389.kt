package com.guanhong.leetcodeeveryday

class LeetCode1389 {

    fun createTargetArray(nums : IntArray, targetIndexArray : IntArray) : IntArray {

        var index = 0

        val numCount = nums.count()
        val targetIndexCount = targetIndexArray.count()

        val answer = mutableListOf<Int>()

        while (index < numCount && index < targetIndexCount) {

            answer.add(targetIndexArray[index], nums[index])

            index++
        }

        return answer.toIntArray()
    }
}