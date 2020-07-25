package com.guanhong.leetcodeeveryday.easy

import kotlin.math.sqrt

class LeetCode633 {

    fun judgeSquareSum(c : Int) : Boolean {

        for (i in 0..sqrt(c.toDouble()).toInt()) {

            for (j in i..sqrt(c.toDouble()).toInt()) {

                if (i * i + j * j == c) {

                    return true
                }
            }
        }

        return false
    }
}