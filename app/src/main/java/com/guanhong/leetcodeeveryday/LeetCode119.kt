package com.guanhong.leetcodeeveryday

class LeetCode119 {

    fun getRow(rowIndex : Int) : List<Int> {

        return calculate(rowIndex, listOf(1))
    }

    fun calculate(rowIndex : Int, list : List<Int>) : List<Int> {

        if (rowIndex == 0) {

            return list
        }

        val nextRowList = mutableListOf(1)

        for (i in 0 until list.count() - 1) {

            nextRowList.add(list[i] + list[i + 1])
        }

        nextRowList.add(1)

        return calculate(rowIndex - 1, nextRowList)
    }
}