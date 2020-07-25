package com.guanhong.leetcodeeveryday.easy

import kotlin.math.max

class LeetCode1446 {

    fun maxPower(s : String) : Int {

        var answer = 1

        var maxPower = 1

        var previousChar = s.first()

        for (index in 1..s.lastIndex) {

            if (s[index] == previousChar) {

                maxPower++

                answer = max(answer, maxPower)
            } else {

                maxPower = 1
            }

            previousChar = s[index]
        }

        return answer
    }
}