package com.guanhong.leetcodeeveryday

class LeetCode20 {

    fun isValid(s : String) : Boolean {

        if (s.count() % 2 != 0) return false
        if (s.isEmpty()) return true

        var newS = ""
        var index = 0

        var needToAddLastChar = true
        var hasNextRound = false

        while (index < s.count() - 1) {

            val thisChar = s[index]
            val nextChar = s[index + 1]

            if (checkParentheses(thisChar, nextChar)) {

                if (index == s.count() - 2) {
                    needToAddLastChar = false
                }
                hasNextRound = true
                index += 2
            } else {

                newS += thisChar
                index++
            }
        }

        if (needToAddLastChar) {

            newS += s[s.count() - 1]
        }
        if (newS == s) {

            return false
        }

        return if (hasNextRound) {
            isValid(newS)
        } else {
            true
        }
    }

    fun checkParentheses(forward : Char, backward : Char) : Boolean {

        return when (forward) {

            '{' -> backward == '}'
            '[' -> backward == ']'
            '(' -> backward == ')'
            else -> false
        }
    }
}