package com.guanhong.leetcodeeveryday

class LeetCode1365 {

    fun smallerNumbersThanCurrent(nums : IntArray) : IntArray {

        val sortedList = nums.sorted()

        val answer = IntArray(nums.count())

        nums.forEachIndexed { index, int ->

            answer[index] = sortedList.indexOf(int)
        }

        return answer
    }
}