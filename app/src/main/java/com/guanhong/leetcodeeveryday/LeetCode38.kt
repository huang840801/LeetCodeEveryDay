package com.guanhong.leetcodeeveryday

class LeetCode38 {

    fun countAndSay(n : Int) : String {

        return cal(n, "1")
    }

    fun cal(n : Int, s : String) : String {

        if (n == 1) return s

        var string = ""

        var previousString = s[0]
        var count = 1

        for (index in 1 until s.count()) {

            if (s[index] != previousString) {

                string = string + count + previousString

                count = 1
            } else {

                count++
            }

            previousString = s[index]
        }

        string = string + count + previousString

        return cal(n - 1, string)
    }
}