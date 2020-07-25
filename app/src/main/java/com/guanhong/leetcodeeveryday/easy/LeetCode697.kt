package com.guanhong.leetcodeeveryday.easy

class LeetCode697 {

    fun findShortestSubArray(nums : IntArray) : Int {

        if (nums.count() <= 1) return nums.count()

        val mutableMap = mutableMapOf<Int, Int>()

        nums.forEach {

            if (mutableMap[it] == null) {

                mutableMap[it] = 1
            } else {

                mutableMap[it] = mutableMap[it]!! + 1
            }
        }

        var degree = 2147483647
        var maxDegreeCount = 0

        mutableMap.forEach {

            if (it.value > maxDegreeCount) {

                maxDegreeCount = it.value
            }
        }

        mutableMap.forEach {

            if (it.value == maxDegreeCount) {

                val firstIndexOf = nums.indexOf(it.key)
                val lastIndexOf = nums.lastIndexOf(it.key)

                if (lastIndexOf - firstIndexOf + 1 < degree) {

                    degree = lastIndexOf - firstIndexOf + 1
                }
            }
        }

        return degree
    }
}