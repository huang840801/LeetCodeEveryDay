package com.guanhong.leetcodeeveryday.easy

class LeetCode628 {

    fun maximumProduct(nums : IntArray) : Int {

        if (nums.count() < 3) return 0

        val sortedNum = nums.sorted()

        val forwardSum =
            sortedNum[sortedNum.lastIndex] * sortedNum[sortedNum.lastIndex - 1] * sortedNum[sortedNum.lastIndex - 2]

        val backwardSum =
            sortedNum[0] * sortedNum[1] * sortedNum[sortedNum.lastIndex]

        return if (forwardSum > backwardSum) forwardSum else backwardSum
    }
}