package com.guanhong.leetcodeeveryday.medium

class LeetCode63 {

    fun uniquePathsWithObstacles(obstacleGrid : Array<IntArray>) : Int {

        if (obstacleGrid.isEmpty()) return 1
        if (obstacleGrid[0].isEmpty()) return 1
        if (obstacleGrid[0][0] == 1) return 0

        val row = obstacleGrid.count()
        val column = obstacleGrid.first().count()

        val grid = Array(row) { IntArray(column) { -1 } }

        obstacleGrid.forEachIndexed { rowIndex, intArray ->

            intArray.forEachIndexed { columnIndex, int ->

                if (obstacleGrid[rowIndex][columnIndex] == 0) {

                    grid[rowIndex][columnIndex] = -1
                } else {

                    grid[rowIndex][columnIndex] = 0
                }
            }
        }

        grid[0][0] = 1

        grid.forEachIndexed { rowIndex, intArray ->

            intArray.forEachIndexed { columnIndex, int ->

                if (rowIndex != 0 || columnIndex != 0) {

                    if (grid[rowIndex][columnIndex] == -1) {

                        when {
                            rowIndex == 0 -> grid[rowIndex][columnIndex] =
                                grid[rowIndex][columnIndex - 1]
                            columnIndex == 0 -> grid[rowIndex][columnIndex] =
                                grid[rowIndex - 1][columnIndex]
                            else -> grid[rowIndex][columnIndex] =
                                grid[rowIndex - 1][columnIndex] + grid[rowIndex][columnIndex - 1]
                        }
                    }
                }
            }
        }

        return grid[row - 1][column - 1]
    }
}