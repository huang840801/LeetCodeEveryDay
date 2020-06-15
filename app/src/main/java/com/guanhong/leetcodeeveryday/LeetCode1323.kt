package com.guanhong.leetcodeeveryday

import java.lang.StringBuilder

class LeetCode1323 {

    fun maximum69Number(num : Int) : Int {

        val numToString = num.toString()

        val stringBuilder = StringBuilder()

        numToString.forEachIndexed { index, char ->

            if (char == '6') {

                stringBuilder.append("9")
                stringBuilder.append(numToString.substring(index + 1 until numToString.count()))

                return stringBuilder.toString().toInt()
            } else {

                stringBuilder.append("9")
            }
        }

        return stringBuilder.toString().toInt()
    }
}