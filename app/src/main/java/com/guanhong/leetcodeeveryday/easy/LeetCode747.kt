package com.guanhong.leetcodeeveryday.easy

class LeetCode747 {

    fun dominantIndex(nums : IntArray) : Int {

        if (nums.isEmpty()) return 0

        val max = nums.max()!!
        val maxIndex = nums.indexOf(max)

        nums.forEachIndexed { index, i ->

            if (index != maxIndex) {

                if (i * 2 > max) {

                    return -1
                }
            }
        }

        return maxIndex
    }
}