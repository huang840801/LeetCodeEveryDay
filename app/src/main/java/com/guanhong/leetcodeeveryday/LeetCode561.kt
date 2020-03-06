package com.guanhong.leetcodeeveryday

class LeetCode561 {

    fun arrayPairSum(nums : IntArray) : Int {

        val sortedNums = nums.sorted()
        var answer = 0

        for (i in 0 until sortedNums.count() step 2) {

            answer += sortedNums[i]
        }
        return answer
    }
}