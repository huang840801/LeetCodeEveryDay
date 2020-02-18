package com.guanhong.leetcodeeveryday

class LeetCode448 {

    fun findDisappearedNumbers(nums : IntArray) : List<Int> {

        val mutableMap = mutableMapOf<Int, Boolean>()

        val answerList = mutableListOf<Int>()

        nums.forEach {

            if (mutableMap[it] == null || !mutableMap[it]!!) {

                mutableMap[it] = true
            }
        }

        for (i in 1 .. nums.count()) {

            if (!mutableMap.containsKey(i)) {

                answerList.add(i)
            }
        }

        return answerList
    }
}