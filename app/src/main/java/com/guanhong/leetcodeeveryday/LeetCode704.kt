package com.guanhong.leetcodeeveryday

class LeetCode704 {

    fun search(nums : IntArray, target : Int) : Int {

        var middleNum = nums[nums.count() / 2]
        var middleNumIndex = nums.indexOf(middleNum)

        val mutableList = nums.toMutableList()
        var startIndex = 0
        var endIndex = nums.count() - 1

        while (middleNum != target) {

            if (mutableList.count() <= 2) {

                return if (mutableList[0] == target) nums.indexOf(target)
                else -1
            }

            mutableList.clear()

            if (target > middleNum) startIndex = nums.indexOf(middleNum)
            else endIndex = nums.indexOf(middleNum)

            for (index in startIndex..endIndex) {

                mutableList.add(nums[index])
            }

            middleNum = mutableList[mutableList.count() / 2]
            middleNumIndex = nums.indexOf(middleNum)
        }

        return middleNumIndex
    }
}