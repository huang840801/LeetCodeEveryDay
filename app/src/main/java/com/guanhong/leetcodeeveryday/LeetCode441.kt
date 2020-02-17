package com.guanhong.leetcodeeveryday

class LeetCode441 {
    fun arrangeCoins(n: Int): Int {

        var rowCount = 1
        var totalCount = n

        while (totalCount > 0) {

            rowCount++

            totalCount -= rowCount
        }

        return rowCount - 1
    }
}