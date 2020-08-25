package com.guanhong.leetcodeeveryday.medium

class LeetCode59 {

    private var direct = DIRECT.LEFT_TO_RIGHT

    fun generateMatrix(n : Int) : Array<IntArray> {

        var index = 1

        val answer = Array(n) { IntArray(n) }

        var row = 0
        var column = 0

        var rowMax = n - 1
        var rowMin = 1

        var columnMax = n - 1
        var columnMin = 0

        while (index <= n * n) {

            println("Huang row=$row column=$column")

            answer[row][column] = index

            when (direct) {
                DIRECT.LEFT_TO_RIGHT -> {

                    if (column == columnMax) {

                        changeDirect()
                        columnMax--
                        row++
                    } else {

                        column++
                    }
                }
                DIRECT.UP_TO_DOWN -> {

                    if (row == rowMax) {

                        changeDirect()
                        rowMax--
                        column--
                    } else {

                        row++
                    }
                }
                DIRECT.RIGHT_TO_LEFT -> {

                    if (column == columnMin) {

                        changeDirect()
                        columnMin++
                        row--
                    } else {

                        column--
                    }
                }
                DIRECT.DOWN_TO_UP -> {

                    if (row == rowMin) {

                        changeDirect()
                        rowMin++
                        column++
                    } else {

                        row--
                    }
                }
            }

            index++
        }

        return answer
    }

    private fun changeDirect() {

        when (direct) {
            DIRECT.LEFT_TO_RIGHT -> {

                direct = DIRECT.UP_TO_DOWN
            }
            DIRECT.UP_TO_DOWN -> {

                direct = DIRECT.RIGHT_TO_LEFT
            }
            DIRECT.RIGHT_TO_LEFT -> {

                direct = DIRECT.DOWN_TO_UP
            }
            DIRECT.DOWN_TO_UP -> {

                direct = DIRECT.LEFT_TO_RIGHT
            }
        }
    }
}