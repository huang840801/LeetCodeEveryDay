package com.guanhong.leetcodeeveryday.easy

class LeetCode1295 {

    fun findNumbers(nums : IntArray) : Int {

        var answer = 0

        nums.forEach {

            if (getDigitNumber(it) % 2 == 0) answer++
        }

        return answer
    }

    private fun getDigitNumber(num : Int) : Int {

        return if (num < 10) {

            1
        } else {

            getDigitNumber((num / 10)) + 1
        }
    }
}