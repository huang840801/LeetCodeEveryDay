package com.guanhong.leetcodeeveryday.easy

class LeetCode1475 {

    fun finalPrices(prices : IntArray) : IntArray {

        val answer = IntArray(prices.count())

        prices.forEachIndexed { index, i ->

            answer[index] = getDisCount(prices, index + 1, i)
        }

        return answer
    }

    private fun getDisCount(prices : IntArray, startIndex : Int, num : Int) : Int {

        for (index in startIndex until prices.count()) {

            if (prices[index] <= num) {

                return num - prices[index]
            }
        }

        return num
    }
}