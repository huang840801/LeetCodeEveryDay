package com.guanhong.leetcodeeveryday

class LeetCode1380 {

    fun luckyNumbers(matrix : Array<IntArray>) : List<Int> {

        val minList = mutableListOf<Int>()
        val maxList = mutableListOf<Int>()

        matrix.forEach {

            minList.add(it.min()!!)
        }

        val temp = mutableListOf<Int>()

        for (row in 0 until matrix[0].count()) {

            for (column in 0 until matrix.count()) {

                temp.add(matrix[column][row])
            }
            maxList.add(temp.max()!!)

            temp.clear()
        }


        return minList.intersect(maxList).toList()
    }
}