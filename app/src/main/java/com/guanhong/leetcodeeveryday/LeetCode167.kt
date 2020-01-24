package com.guanhong.leetcodeeveryday

class LeetCode167 {

    fun twoSum(numbers : IntArray, target : Int) : IntArray {

        val answerIntArray = IntArray(2)
        val mutableMap = mutableMapOf<Int, Int>()

        numbers.forEachIndexed { index, number ->

            if (mutableMap.containsKey(number)) {

                answerIntArray[0] = mutableMap[number]!! + 1
                answerIntArray[1] = index + 1

                return answerIntArray
            }

            mutableMap[target - number] = index
        }

        return intArrayOf()
    }
}