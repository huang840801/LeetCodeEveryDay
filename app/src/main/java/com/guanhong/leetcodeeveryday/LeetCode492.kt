package com.guanhong.leetcodeeveryday

import kotlin.math.sqrt

class LeetCode492 {

    fun constructRectangle(area : Int) : IntArray {

        if (area == 1) return intArrayOf(1, 1)

        var minDiff = area
        val answer = IntArray(2)

        for (i in 1..sqrt(area.toDouble()).toInt()) {

            if (area % i == 0) {

                val diff = i - area / i

                if (diff <= 0 && -diff < minDiff) {

                    minDiff = -diff

                    answer[0] = area / i
                    answer[1] = i
                }
            }
        }

        return answer
    }
}