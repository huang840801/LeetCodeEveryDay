package com.guanhong.leetcodeeveryday.easy

class LeetCode409 {

    fun longestPalindrome(s : String) : Int {

        val mutableMap = mutableMapOf<Char, Int?>()
        var answer = 0

        s.forEach {

            when {
                mutableMap[it] == null -> mutableMap[it] = 1
                else -> {

                    answer += 2
                    mutableMap.remove(it)
                }
            }
        }

        return if (mutableMap.count() > 0) {

            answer + 1
        } else {

            answer
        }
    }
}