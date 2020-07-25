package com.guanhong.leetcodeeveryday.easy

class LeetCode1009 {

    fun bitwiseComplement(N : Int) : Int {

        var x = 1

        while (N > x) {

            x = x * 2 + 1
        }

        return x - N
    }
}