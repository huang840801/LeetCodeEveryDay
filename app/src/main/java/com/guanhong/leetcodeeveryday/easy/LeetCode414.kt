package com.guanhong.leetcodeeveryday.easy

class LeetCode414 {

    fun thirdMax(nums : IntArray) : Int {

        if (nums.count() == 0) return 0
        val removeDuplicateElementArray = removeDuplicateElement(nums)
        if (removeDuplicateElementArray.count() < 3) return removeDuplicateElementArray.max()!!

        return recursiveThirdMax(removeDuplicateElementArray, 0)
    }

    fun recursiveThirdMax(nums : IntArray, recursiveTime : Int) : Int {

        if (recursiveTime == 2) return nums.max()!!

        val mutableListOf = mutableListOf<Int>()

        for (i in 0 until nums.count()) {

            if (nums[i] != nums.max()) {

                mutableListOf.add(nums[i])
            }
        }

        return recursiveThirdMax(mutableListOf.toIntArray(), recursiveTime + 1)
    }

    fun removeDuplicateElement(nums : IntArray) : IntArray {

        val mutableMap = mutableMapOf<Int, Int>()

        for (element in nums) {
            mutableMap[element] = element
        }

        val intArray = IntArray(mutableMap.count())

        var index = 0
        for (mutableEntry in mutableMap) {

            intArray[index] = mutableEntry.value
            index++
        }

        return intArray
    }
}