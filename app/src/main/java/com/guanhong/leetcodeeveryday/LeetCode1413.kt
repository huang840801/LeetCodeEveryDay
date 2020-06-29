package com.guanhong.leetcodeeveryday

class LeetCode1413 {

    fun minStartValue(nums : IntArray) : Int {

        var answer = 0

        var temp = 0

        nums.forEach {

            temp += it

            if (temp < 1) {

                answer = answer - temp + 1

                temp = 1
            }
        }

        return if (answer == 0) 1 else answer
    }
}