package com.guanhong.leetcodeeveryday.easy

import kotlin.math.abs

class LeetCode1544 {

    fun makeGood(s : String) : String {

        for (index in 0 until s.length - 1) {

            if (abs(s[index] - s[index + 1]) == 32) {

                return makeGood(s.substring(0, index) + s.substring(index + 2))
            }
        }

        return s
    }
}