package com.guanhong.leetcodeeveryday

class LeetCode342 {

    fun isPowerOfFour(num : Int) : Boolean {

        return when {

            num < 1 -> false
            num == 1 -> true
            num % 4 != 0 -> return false
            else -> isPowerOfFour(num / 4)
        }
    }
}