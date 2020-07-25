package com.guanhong.leetcodeeveryday.easy

class LeetCode1260 {

    fun shiftGrid(grid : Array<IntArray>, k : Int) : List<List<Int>> {

        var lastElement = 0

        for (time in 1..k) {

            for (row in grid.lastIndex downTo 0) {

                for (column in grid[row].lastIndex downTo 0) {

                    when {

                        (row == grid.lastIndex && column == grid[row].lastIndex) -> {//最後一列最後一行

                            lastElement = grid[row][column]
                        }
                        else -> {

                            if (column + 1 <= grid[row].lastIndex) {

                                grid[row][column + 1] = grid[row][column]
                            } else {

                                grid[row + 1][0] = grid[row][column]
                            }
                        }
                    }
                }
            }

            grid[0][0] = lastElement
        }

        val answer = mutableListOf<List<Int>>()

        grid.forEach { row ->

            val mutableList = mutableListOf<Int>()

            row.forEach { column ->

                mutableList.add(column)
            }
            answer.add(mutableList)

        }

        return answer
    }
}