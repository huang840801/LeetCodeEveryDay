package com.guanhong.leetcodeeveryday.easy

class LeetCode746 {

    fun minCostClimbingStairs(cost : IntArray) : Int {

        var twoStepBefore = cost[0]
        var oneStepBefore = cost[1]
        var curr : Int

        for (i in 2 until cost.size) {

            curr = Math.min(twoStepBefore, oneStepBefore) + cost[i]
            twoStepBefore = oneStepBefore
            oneStepBefore = curr
        }
        return Math.min(oneStepBefore, twoStepBefore)
    }
}