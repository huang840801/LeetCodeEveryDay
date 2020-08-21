package com.guanhong.leetcodeeveryday.medium

class LeetCode54 {

    var direct = DIRECT.LEFT_TO_RIGHT

    fun spiralOrder(matrix : Array<IntArray>) : List<Int> {

        if (matrix.isEmpty()) {

            return listOf()
        }

        val answer = mutableListOf<Int>()

        val rowCount = matrix.count()
        val columnCount = matrix[0].count()

        val totalCount = rowCount * columnCount

        var row = 0
        var column = 0

        var rowMax = rowCount - 1
        var rowMin = 1

        var columnMax = columnCount - 1
        var columnMin = 0

        var stepCount = 0

        while (stepCount < totalCount) {

            answer.add(matrix[row][column])

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

            stepCount++
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

enum class DIRECT {

    LEFT_TO_RIGHT,
    RIGHT_TO_LEFT,
    UP_TO_DOWN,
    DOWN_TO_UP
}
