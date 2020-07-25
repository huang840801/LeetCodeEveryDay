package com.guanhong.leetcodeeveryday.medium

class LeetCode5 {

    fun longestPalindrome(s : String) : String? {

        if (s.isEmpty()) return ""

        var answerStart = 0
        var answerEnd = 0
        var max = 0

        for (index in 0 until s.count()) {

            if ((index - max - 1 >= 0) && isPalindrome(s.substring(index - max - 1..index))) {

                answerStart = index - max - 1
                answerEnd = index
                max += 2
            } else if ((index - max >= 0) && isPalindrome(s.substring(index - max..index))) {

                answerStart = index - max
                answerEnd = index
                max += 1
            }
        }
        return s.substring(answerStart, answerEnd + 1)
    }

    private fun isPalindrome(string : String) : Boolean {

        return string.reversed() == string
    }
}
