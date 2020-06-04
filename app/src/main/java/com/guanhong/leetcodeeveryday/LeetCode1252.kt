package com.guanhong.leetcodeeveryday

class LeetCode1252 {

    fun oddCells(n : Int, m : Int, indices : Array<IntArray>) : Int {

        var answer = 0

        val mutableMap = mutableMapOf<String, Int>()

        for (row in 0 until n) {

            for (column in 0 until m) {

                mutableMap["row${row}column$column"] = 0
            }
        }

        indices.forEach {

            val thisRow = it[0]
            val thisColumn = it[1]

            for (row in 0 until n) {

                mutableMap["row${row}column$thisColumn"] = mutableMap["row${row}column$thisColumn"]!! + 1
            }
            for (column in 0 until m) {

                mutableMap["row${thisRow}column$column"] = mutableMap["row${thisRow}column$column"]!! + 1
            }
        }

        mutableMap.forEach {

            if (it.value % 2 != 0) answer++
        }

        return answer
    }
}