package com.guanhong.leetcodeeveryday

import java.lang.StringBuilder

class LeetCode482 {

    fun licenseKeyFormatting(S : String, K : Int) : String {

        val s = S.replace("-", "")

        val answer = StringBuilder()
        var addCount = 0

        for (i in s.length - 1 downTo 0) {

            answer.append(s[i])
            addCount++

            if (addCount == K && i != 0) {

                answer.append("-")

                addCount = 0
            }
        }

        return answer.reversed().toString().toUpperCase()
    }
}