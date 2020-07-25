package com.guanhong.leetcodeeveryday.easy

class LeetCode122 {

    fun maxProfit(prices : IntArray) : Int {

        var profit = 0

        for (index in 1..prices.lastIndex) {

            val thisPrice = prices[index]
            val previousPrice = prices[index - 1]

            if (thisPrice > previousPrice) {

                profit += thisPrice - previousPrice
            }
        }

        return profit
    }
}