package com.guanhong.leetcodeeveryday.easy

class LeetCode693 {

    fun hasAlternatingBits(n : Int) : Boolean {

        if (n < 3) return true

        val binary = decimalToBinary(n)

        var previousElement = binary[0]

        for (index in 1 until binary.length) {

            if (binary[index] != previousElement) {

                previousElement = binary[index]
            } else {

                return false
            }
        }

        return true
    }

    fun decimalToBinary(n : Int) : String {

        return if (n < 2) {

            n.toString()
        } else {

            decimalToBinary(n / 2) + decimalToBinary(n % 2)
        }
    }
}