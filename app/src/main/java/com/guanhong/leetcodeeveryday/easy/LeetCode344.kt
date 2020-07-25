package com.guanhong.leetcodeeveryday.easy

class LeetCode344 {

    fun reverseString(s : CharArray) {

        val size = s.count()
        if (size == 0) return

        var temp : Char

        for (index in 0..((size - 1) / 2)) {

            temp = s[index]
            s[index] = s[size - index - 1]
            s[size - index - 1] = temp
        }
    }
}