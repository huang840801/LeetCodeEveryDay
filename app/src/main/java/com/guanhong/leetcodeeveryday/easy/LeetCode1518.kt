package com.guanhong.leetcodeeveryday.easy

class LeetCode1518 {

    fun numWaterBottles(numBottles : Int, numExchange : Int) : Int {

        return helper(numBottles, numExchange, 0)
    }

    fun helper(numBottles : Int, numExchange : Int, numEmptyBottles : Int) : Int {

        if (numBottles + numEmptyBottles < numExchange) return numBottles

        return numBottles + helper(
            (numBottles + numEmptyBottles) / numExchange,
            numExchange,
            (numBottles + numEmptyBottles) % numExchange
        )
    }
}