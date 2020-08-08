package com.guanhong.leetcodeeveryday.medium

class LeetCode48 {

    fun rotate(matrix : Array<IntArray>) {

        val list = mutableListOf<Int>()

        matrix.forEach {

            it.forEach { int ->

                list.add(int)
            }
        }

        val lastIndex = matrix.lastIndex
        var column = lastIndex
        var row = 0
        var index = 0

        while (column >= 0) {

            while (row < lastIndex + 1) {

                matrix[row][column] = list[index]
                row++
                index++
            }
            row = 0
            column--
        }
    }
}