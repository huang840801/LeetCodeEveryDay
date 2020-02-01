package com.guanhong.leetcodeeveryday

class LeetCode1 {

    fun twoSum(nums : IntArray, target : Int) : IntArray {

        val mutableMap = mutableMapOf<Int, Int>()
        val answer = IntArray(2)

        nums.forEachIndexed { index, num ->

            if (mutableMap.containsKey(target - num)) {

                answer[0] = mutableMap[target - num]!!
                answer[1] = index

                return answer
            }

            mutableMap[num] = index
        }

        return intArrayOf()
    }
}