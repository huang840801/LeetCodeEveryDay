package com.guanhong.leetcodeeveryday

class LeetCode121 {

    fun maxProfit(prices : IntArray) : Int {

        if (prices.count() == 0) return 0

        var maxProfit = 0
        var minNum = Util.instance.getMax(prices)

        prices.forEach { num ->

            if (num < minNum) {

                minNum = num
            }

            if (num - minNum > maxProfit) {

                maxProfit = num - minNum
            }
        }

        return maxProfit
    }
}