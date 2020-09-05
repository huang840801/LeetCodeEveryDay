package com.guanhong.leetcodeeveryday.medium

import kotlin.math.min

class LeetCode120 {

    fun minimumTotal(triangle : List<List<Int>>) : Int {

        val top = triangle[0][0]

        if (triangle.count() == 1) return top

        return helper(triangle, 1, 0, top)
    }

    fun helper(list : List<List<Int>>, row : Int, column : Int, sum : Int) : Int {

        val left = list[row][column]
        val right = list[row][column + 1]

        return if (row == list.lastIndex) {

            sum + min(left, right)
        } else {

            val leftSum = helper(list, row + 1, column, sum + left)
            val rightSum = helper(list, row + 1, column + 1, sum + right)

            min(leftSum, rightSum)
        }
    }
}