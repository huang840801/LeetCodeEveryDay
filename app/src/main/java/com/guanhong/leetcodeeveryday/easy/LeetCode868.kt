package com.guanhong.leetcodeeveryday.easy

import kotlin.math.max

class LeetCode868 {

    fun binaryGap(N : Int) : Int {

        val binaryString = decimalToBinary(N)
        val binaryCharArray = binaryString.toCharArray()

        var maxLength = 0
        var previousOnePosition = -1
        binaryCharArray.forEachIndexed { index, char ->

            if (char == '1') {

                if (previousOnePosition != -1) {

                    maxLength = max(maxLength, index - previousOnePosition)
                }
                previousOnePosition = index
            }
        }

        return maxLength
    }

    private fun decimalToBinary(n : Int) : String {

        return if (n < 2) {

            n.toString()
        } else {

            decimalToBinary((n / 2)) + decimalToBinary(n % 2)
        }
    }
}