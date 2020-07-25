package com.guanhong.leetcodeeveryday.medium

import kotlin.math.max
import kotlin.math.min

class LeetCode11 {

    fun maxArea(height : IntArray) : Int {

        var left = 0
        var right = height.count() - 1
        var answer = 0

        while (left < right) {

            val areaWidth = right - left
            val areaHeight = min(height[right], height[left])

            answer = max(answer, areaWidth * areaHeight)

            if (height[left] > height[right]) {

                right--
            } else {
                left++
            }
        }

        return answer
    }
}