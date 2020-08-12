package com.guanhong.leetcodeeveryday.easy

class LeetCode1523 {

    fun countOdds(low : Int, high : Int) : Int {

        var answer = (high - low) / 2

        if (low % 2 != 0 || high % 2 != 0) {

            answer++
        }

        return answer
    }
}