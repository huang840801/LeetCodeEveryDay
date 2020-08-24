package com.guanhong.leetcodeeveryday.easy

class LeetCode1550 {

    fun threeConsecutiveOdds(arr : IntArray) : Boolean {

        var consecutiveCount = 0

        arr.forEach {

            if (it % 2 == 0) {

                consecutiveCount = 0
            } else {

                consecutiveCount++

                if (consecutiveCount == 3) {

                    return true
                }
            }
        }

        return false
    }
}