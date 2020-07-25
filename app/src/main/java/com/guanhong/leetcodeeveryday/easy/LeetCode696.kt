package com.guanhong.leetcodeeveryday.easy

import kotlin.math.min

class LeetCode696 {

    fun countBinarySubstrings(s : String) : Int {

        if (s.isEmpty()) return 0

        var answer = 0

        var cursor = 1

        var previous = 0

        s.forEachIndexed { index, c ->

            if (index > 0) {

                if (c == s[index - 1]) {

                    cursor++
                } else {

                    answer += min(cursor, previous)

                    previous = cursor
                    cursor = 1
                }
            }
        }
        return answer + min(cursor, previous)
    }
}