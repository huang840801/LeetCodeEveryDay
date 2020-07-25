package com.guanhong.leetcodeeveryday.medium

class LeetCode31 {

    fun nextPermutation(nums : IntArray) {

        var previousNum : Int = nums.last()

        for (index in nums.lastIndex - 1 downTo 0) {

            val thisNum = nums[index]

            if (thisNum < previousNum) {

                //必為降冪排列
                val sub = nums.toMutableList().subList(index + 1, nums.lastIndex + 1)

                val numToBeChange = sub.lastOrNull { it > thisNum } ?: sub.last()

                val numToBeChangeIndex = nums.lastIndexOf(numToBeChange)

                swap(nums, index, numToBeChangeIndex)

                sub.add(thisNum)
                sub.remove(numToBeChange)

                sub.sort()

                for (index1 in 0 until sub.count()) {

                    nums[index + 1 + index1] = sub[index1]
                }

                return
            }

            previousNum = thisNum
        }

        nums.reverse()
    }

    private fun swap(nums : IntArray, index : Int, index1 : Int) {

        val temp = nums[index]
        nums[index] = nums[index1]
        nums[index1] = temp
    }
}