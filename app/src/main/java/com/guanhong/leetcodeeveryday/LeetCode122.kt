package com.guanhong.leetcodeeveryday

class LeetCode122 {

    fun maxProfit(prices : IntArray) : Int {

        if (prices.count() == 1) return 0

        var profit = 0

        var listIndex = 0

        val increaseCollectionList = mutableListOf<List<Int>>()

        val increaseList = mutableListOf<Int>()

        var temp = prices[0]

        var isIncrease = temp < prices[1]

        if (isIncrease) {

            increaseList.add(temp)
        }

        for (index in 1 until prices.count()) {

            if (temp <= prices[index]) {

                if (!isIncrease) {

                    increaseList.add(temp)
                    isIncrease = true
                }

                increaseList.add(prices[index])
            } else {

                if (isIncrease) {

                    val listTemp = increaseList.map { it }

                    increaseCollectionList.add(listTemp)

                    increaseList.clear()

                    listIndex++
                }

                isIncrease = false
            }

            temp = prices[index]
        }

        if (isIncrease) {

            increaseCollectionList.add(increaseList)
        }

        increaseCollectionList.forEach {

            val maxPrice = it[it.lastIndex]
            val minPrice = it[0]

            val thisProfit = maxPrice - minPrice

            profit += thisProfit
        }

        return profit
    }
}