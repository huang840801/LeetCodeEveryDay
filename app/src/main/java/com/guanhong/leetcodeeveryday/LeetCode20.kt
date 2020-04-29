package com.guanhong.leetcodeeveryday

class LeetCode20 {

    fun isValid(s : String) : Boolean {

        var string = s

        while (string.contains("()")
            || string.contains("[]")
            || string.contains("{}")) {

            string = string.replace("()", "")
            string = string.replace("[]", "")
            string = string.replace("{}", "")
        }

        return string.isEmpty()
    }
}