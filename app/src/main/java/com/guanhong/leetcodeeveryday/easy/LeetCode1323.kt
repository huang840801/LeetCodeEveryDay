package com.guanhong.leetcodeeveryday.easy

class LeetCode1323 {

    fun maximum69Number(num : Int) : Int {

        return num.toString().replaceFirst("6", "9").toInt()
    }
}