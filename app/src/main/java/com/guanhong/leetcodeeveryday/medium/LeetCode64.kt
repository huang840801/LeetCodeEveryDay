package com.guanhong.leetcodeeveryday.medium

import kotlin.math.min

class LeetCode64 {

    fun minPathSum(grid : Array<IntArray>) : Int {

        if (grid.isEmpty()) return 0

        val rowCount = grid.count()
        val columnCount = grid[0].count()

        for (row in 1..grid.lastIndex) {

            grid[row][0] += grid[row - 1][0]
        }
        for (column in 1..grid[0].lastIndex) {

            grid[0][column] += grid[0][column - 1]
        }
        for (row in 1..grid.lastIndex) {

            for (column in 1..grid[0].lastIndex) {

                val minPath = min(grid[row - 1][column], grid[row][column - 1])

                grid[row][column] += minPath
            }
        }

        return grid[rowCount - 1][columnCount - 1]
    }
}