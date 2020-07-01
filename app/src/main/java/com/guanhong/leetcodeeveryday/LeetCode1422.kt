package com.guanhong.leetcodeeveryday

import kotlin.math.max

class LeetCode1422 {

    fun maxScore(s : String) : Int {

        var countOfOne = 0
        var countOfZero = 0

        var maxScore = Integer.MIN_VALUE

        s.forEachIndexed { index, char ->

            if (char == '0') {

                countOfZero++
            } else {

                countOfOne++
            }

            if (index != s.count() - 1) {

                maxScore = max(maxScore, countOfZero - countOfOne)
            }
        }

        return maxScore + countOfOne
    }
}