package com.guanhong.leetcodeeveryday.easy

class LeetCode1470 {

    fun shuffle(nums : IntArray, n : Int) : IntArray {

        val answer = IntArray(2 * n)

        var index = 0

        while (index < n) {

            answer[index * 2] = nums[index]
            answer[index * 2 + 1] = nums[index + n]

            index++
        }

        return answer
    }
}