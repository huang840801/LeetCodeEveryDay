package com.guanhong.leetcodeeveryday.easy

class LeetCode1356 {

    fun sortByBits(arr : IntArray) : IntArray {

        return arr.sorted().sortedBy { getBitCount(it) }.toIntArray()
    }

    fun getBitCount(n : Int) : Int {

        if (n == 0) return 0
        if (n == 1) return 1

        var num = n
        var bitCount = 0

        while (num > 1) {

            if (num % 2 == 1) {

                bitCount++
            }

            num /= 2
        }

        if (num == 1) {

            bitCount++
        }

        return bitCount
    }
}