package com.guanhong.leetcodeeveryday.easy

class LeetCode1021 {

    fun removeOuterParentheses(S : String) : String {

        val answer = StringBuilder()

        var leftParenthesesCount = 0

        var temp = ""

        S.forEach {

            if (it == '(') leftParenthesesCount++ else leftParenthesesCount--

            temp += it.toString()

            if (leftParenthesesCount == 0) {

                answer.append(temp.substring(1 until temp.lastIndex))

                temp = ""
            }
        }

        return answer.toString()
    }
}