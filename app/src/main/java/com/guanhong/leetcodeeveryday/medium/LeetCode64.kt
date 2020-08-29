package com.guanhong.leetcodeeveryday.medium

class LeetCode64 {

    private val pathList = mutableListOf<Int>()

    fun minPathSum(grid : Array<IntArray>) : Int {

        if (grid.isEmpty()) return 0

        helper(0, 0, 0, grid)

        return pathList.min() ?: 0
    }

    private fun helper(pathSum : Int, row : Int, column : Int, grid : Array<IntArray>) {

        if (row == grid.lastIndex && column == grid[0].lastIndex) {

            pathList.add(pathSum + grid[row][column])
        } else {

            if (row < grid.lastIndex) {

                helper(pathSum + grid[row][column], row + 1, column, grid)
            }
            if (column < grid[0].lastIndex) {

                helper(pathSum + grid[row][column], row, column + 1, grid)
            }
        }
    }
}