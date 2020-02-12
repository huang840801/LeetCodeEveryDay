package com.guanhong.leetcodeeveryday

class LeetCode392 {

    fun isSubsequence(s : String, t : String) : Boolean {

        if (s == "") return true

        var index = 0

        t.forEach { char ->

            if (char == s[index]) {

                index++
            }

            if (index == s.lastIndex + 1) {

                return true
            }
        }

        return false
    }
}
