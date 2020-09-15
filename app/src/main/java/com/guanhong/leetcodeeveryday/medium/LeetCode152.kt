package com.guanhong.leetcodeeveryday.medium

import kotlin.math.max
import kotlin.math.min

class LeetCode152 {

    fun maxProduct(nums : IntArray) : Int {

        var answer = Int.MIN_VALUE
        var tempMax = 1
        var tempMin = 1

        for (index in 0..nums.lastIndex) {

            if (nums[index] < 0) {

                val temp = tempMax
                tempMax = tempMin
                tempMin = temp
            }

            tempMax = max(nums[index], tempMax * nums[index])
            tempMin = min(nums[index], tempMin * nums[index])

            answer = max(answer, tempMax)
        }

        return answer
    }
}
