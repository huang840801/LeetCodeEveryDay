package com.guanhong.leetcodeeveryday.easy

class LeetCode1071 {

    fun gcdOfStrings(str1 : String, str2 : String) : String {

        if (str1.isEmpty()) return str2
        if (str2.isEmpty()) return str1

        val longString : String
        val shortString : String

        if (str1.count() > str2.count()) {

            longString = str1
            shortString = str2
        } else {

            longString = str2
            shortString = str1
        }

        return if (longString.contains(shortString)) {

            val newLongString = longString.replace(shortString, "")

            gcdOfStrings(newLongString, shortString)
        } else {

            ""
        }
    }
}