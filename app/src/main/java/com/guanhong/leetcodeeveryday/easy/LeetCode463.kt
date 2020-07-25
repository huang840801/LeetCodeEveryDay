package com.guanhong.leetcodeeveryday.easy

class LeetCode463 {

    fun islandPerimeter(grid : Array<IntArray>) : Int {

        if (grid.count() == 0) return 0

        var perimeter = 0

        for (i in 0 until grid.count()) {

            for (j in 0 until grid[i].count()) {

                if (grid[i][j] == 1) {

                    perimeter += 4

                    if (i > 0 && grid[i - 1][j] == 1) {

                        perimeter -= 2
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {

                        perimeter -= 2
                    }
                }
            }
        }

        return perimeter
    }
}