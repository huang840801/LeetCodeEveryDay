package com.guanhong.leetcodeeveryday.easy

class LeetCode566 {

    fun matrixReshape(nums : Array<IntArray>, r : Int, c : Int) : Array<IntArray> {

        val mutableList = mutableListOf<Int>()

        nums.forEach { intArray ->

            intArray.forEach { int ->

                mutableList.add(int)
            }
        }

        if (mutableList.count() != r * c) return nums

        val answer = Array(r) { IntArray(c) }

        var index = 0
        for (row in 0 until r) {

            for (column in 0 until c) {

                answer[row][column] = mutableList[index]

                index++
            }
        }

        return answer
    }
}