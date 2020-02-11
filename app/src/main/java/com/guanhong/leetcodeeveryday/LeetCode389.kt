package com.guanhong.leetcodeeveryday

class LeetCode389 {

    fun findTheDifference(s: String, t: String): Char {

        var answer = t

        s.forEach {

            val indexOfChar = answer.indexOf(it)

            answer =  answer.removeRange(indexOfChar, indexOfChar +1)
        }

        return answer.toCharArray()[0]
    }
}