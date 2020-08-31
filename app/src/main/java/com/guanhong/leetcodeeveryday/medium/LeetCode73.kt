package com.guanhong.leetcodeeveryday.medium

class LeetCode73 {

    fun setZeroes(matrix : Array<IntArray>) : Unit {

        val pointList = mutableListOf<Point>()

        matrix.forEachIndexed { rowIndex, ints ->

            ints.forEachIndexed { columnIndex, int ->

                if (int == 0) {

                    pointList.add(Point(rowIndex, columnIndex))
                }
            }
        }

        pointList.forEach { point ->

            val row = point.row
            val column = point.column

            matrix.forEach {

                it[column] = 0
            }

            matrix[row].forEachIndexed { index, int ->

                matrix[row][index] = 0
            }
        }
    }
}

data class Point(

    val row : Int,
    val column : Int
)
