package com.guanhong.leetcodeeveryday

class LeetCode1351 {

    fun countNegatives(grid : Array<IntArray>) : Int {

        var answer = 0

        grid.forEach loop@{ intArray ->

            for (i in (intArray.count() - 1) downTo 0) {

                if (intArray[i] < 0) {

                    answer++
                } else {
                    return@loop
                }
            }
        }

        return answer
    }
}