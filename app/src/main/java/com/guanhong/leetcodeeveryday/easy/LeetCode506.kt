package com.guanhong.leetcodeeveryday.easy

class LeetCode506 {

    fun findRelativeRanks(nums : IntArray) : Array<String> {

        val sortedArray = nums.sortedBy { -it }

        val map = mutableMapOf<Int, Int>()

        sortedArray.forEachIndexed { index, i ->

            map[i] = index
        }

        return nums.map {

            when (map[it]) {
                0 -> "Gold Medal"
                1 -> "Silver Medal"
                2 -> "Bronze Medal"
                else -> "${map[it]}"
            }
        }.toTypedArray()
    }
}