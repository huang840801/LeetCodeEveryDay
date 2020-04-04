package com.guanhong.leetcodeeveryday

class LeetCode832 {

    fun flipAndInvertImage(A : Array<IntArray>) : Array<IntArray> {

        var temp : Int

        A.forEach {

            for (index in 0 until it.size / 2) {

                temp = it[index]
                it[index] = it[it.size - index - 1]
                it[it.size - index - 1] = temp
            }
        }

        for (row in 0 until A.size) {

            for (column in 0 until A[row].size) {

                if (A[row][column] == 1) {

                    A[row][column] = 0
                } else {

                    A[row][column] = 1
                }
            }
        }

        return A
    }
}