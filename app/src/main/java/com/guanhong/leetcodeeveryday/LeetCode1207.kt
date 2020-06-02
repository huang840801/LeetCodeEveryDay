package com.guanhong.leetcodeeveryday

class LeetCode1207 {

    fun uniqueOccurrences(arr : IntArray) : Boolean {

        val mutableMap = mutableMapOf<Int, Int>()

        arr.forEach {

            if (mutableMap[it] == null) {

                mutableMap[it] = 1
            } else {

                mutableMap[it] = mutableMap[it]!! + 1
            }
        }

        val mutableSet = mutableSetOf<Int>()

        mutableMap.forEach {
            mutableSet.add(it.value)
        }

        return mutableSet.count() == mutableMap.count()
    }
}