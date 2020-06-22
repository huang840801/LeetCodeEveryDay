package com.guanhong.leetcodeeveryday

import java.lang.StringBuilder

class LeetCode1374 {

    fun generateTheString(n : Int) : String {

        val stringBuilder = StringBuilder()

        if (n % 2 == 0) {

            for (index in 0 until n - 1) {

                stringBuilder.append("a")
            }

            stringBuilder.append("b")
        } else {

            for (index in 0 until n) {

                stringBuilder.append("a")
            }
        }

        return String(stringBuilder)
    }
}