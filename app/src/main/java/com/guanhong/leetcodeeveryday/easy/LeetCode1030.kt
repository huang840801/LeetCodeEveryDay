package com.guanhong.leetcodeeveryday.easy

import kotlin.math.abs

class LeetCode1030 {

    fun allCellsDistOrder(R : Int, C : Int, r0 : Int, c0 : Int) : Array<IntArray> {

        val answer = Array(R * C) { IntArray(2) }

        var index = 0

        for (row in 0 until R) {
            for (column in 0 until C) {

                answer[index][0] = row
                answer[index][1] = column

                index++
            }
        }

        answer.sortBy {

            abs(it[0] - r0) + abs(it[1] - c0)
        }

        return answer
    }
}