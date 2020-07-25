package com.guanhong.leetcodeeveryday.easy

class LeetCode1317 {

    fun getNoZeroIntegers(n : Int) : IntArray {

        for (index in 1 until n) {

            if (!isContainZero(index) && !isContainZero(n - index)) {

                return intArrayOf(index, n - index)
            }
        }
        return intArrayOf()
    }

    private fun isContainZero(num : Int) : Boolean {

        return num.toString().contains("0")
    }
}