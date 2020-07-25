package com.guanhong.leetcodeeveryday.easy

import java.lang.StringBuilder

class LeetCode686 {

    fun repeatedStringMatch(A : String, B : String) : Int {

        val stringBuilder = StringBuilder()

        for (index in 0..(B.length / A.length + 2)) {

            if (stringBuilder.contains(B)) {

                return index
            }
            stringBuilder.append(A)
        }

        return -1
    }
}