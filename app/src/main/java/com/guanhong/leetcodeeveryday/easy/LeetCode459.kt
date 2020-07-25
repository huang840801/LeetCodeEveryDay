package com.guanhong.leetcodeeveryday.easy

class LeetCode459 {

    fun repeatedSubstringPattern(s : String) : Boolean {

        val length = s.count()

        for (i in 1..length / 2) {

            if (length % i == 0) {

                val subString = s.substring(0, i)
                var checkString = ""

                var endIndex : Int

                loop@ for (startIndex in 0..length step i) {

                    endIndex = startIndex + i

                    if (subString == s.substring(startIndex, endIndex)) {

                        checkString += s.substring(startIndex, endIndex)
                    } else {

                        break@loop
                    }

                    if (checkString == s) {

                        return true
                    }
                }
            }
        }

        return false
    }
}