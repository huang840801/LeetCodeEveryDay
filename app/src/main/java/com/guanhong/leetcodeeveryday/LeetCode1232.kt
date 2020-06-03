package com.guanhong.leetcodeeveryday

class LeetCode1232 {

    fun checkStraightLine(coordinates : Array<IntArray>) : Boolean {

        val x0 = coordinates[0][0]
        val y0 = coordinates[0][1]
        val x1 = coordinates[1][0]
        val y1 = coordinates[1][1]

        for (index in 2 until coordinates.count()) {

            val x2 = coordinates[index][0]
            val y2 = coordinates[index][1]

            if ((y0 - y1) * (x2 - x1) != (y2 - y1) * (x0 - x1)) {

                return false
            }
        }

        return true
    }
}