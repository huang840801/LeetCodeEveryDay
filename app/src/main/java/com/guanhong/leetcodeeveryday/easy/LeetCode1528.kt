package com.guanhong.leetcodeeveryday.easy

class LeetCode1528 {

    fun restoreString(s : String, indices : IntArray) : String {

        val charArray = CharArray(s.count())

        (0..s.lastIndex).forEach {

            charArray[indices[it]] = s[it]
        }

        return String(charArray)
    }
}