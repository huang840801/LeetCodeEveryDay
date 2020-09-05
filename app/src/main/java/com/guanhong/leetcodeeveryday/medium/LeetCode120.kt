package com.guanhong.leetcodeeveryday.medium

import kotlin.math.min

class LeetCode120 {

    fun minimumTotal(triangle : List<List<Int>>) : Int {

        val list : MutableList<MutableList<Int>> = mutableListOf()

        triangle.forEach { ints ->

            val temp = ints.map { it }.toMutableList()

            list.add(temp)
        }

        for (i in triangle.size - 2 downTo 0) {

            for (j in 0..i) {

                list[i][j] = list[i][j] + min(list[i + 1][j], list[i + 1][j + 1])
            }
        }

        return list[0][0]
    }
}