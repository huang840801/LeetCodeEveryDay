package com.guanhong.leetcodeeveryday

class LeetCode1313 {

    fun decompressRLElist(nums : IntArray) : IntArray {

        val answer = mutableListOf<Int>()

        var index = 0

        while (index < nums.count() - 1) {

            val time = nums[index]
            val int = nums[index + 1]

            for (index1 in 1..time) {

                answer.add(int)
            }

            index += 2
        }

        return answer.toIntArray()
    }
}