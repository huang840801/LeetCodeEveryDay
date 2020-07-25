package com.guanhong.leetcodeeveryday.easy

import java.util.*

class LeetCode1029 {

    fun twoCitySchedCost(costs : Array<IntArray>) : Int {

        Arrays.sort(costs) { a, b -> (a[0] - a[1] - (b[0] - b[1])) }

        var answer = 0

        for (i in 0 until costs.count() / 2) {

            answer += costs[i][0] + costs[costs.count() - i - 1][1]
        }
        return answer
    }
}