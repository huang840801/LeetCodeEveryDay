package com.guanhong.leetcodeeveryday.medium

class LeetCode62 {

// correct but Time Limit Exceeded
// fun uniquePaths(m: Int, n: Int): Int {
//
// return if (m == 1 || n == 1) {
//
// 1
// } else {
//
// uniquePaths(m - 1, n) + uniquePaths(m, n - 1)
// }
// }

    fun uniquePaths(m : Int, n : Int) : Int {

        val array = Array(n) { IntArray(m) }

        (0 until m).forEach {

            array.first()[it] = 1
        }
        (0 until n).forEach { it ->

            array[it][0] = 1
        }

        for (row in 1 until n) {

            for (column in 1 until m) {

                array[row][column] = array[row - 1][column] + array[row][column - 1]
            }
        }

        return array[n - 1][m - 1]
    }
}