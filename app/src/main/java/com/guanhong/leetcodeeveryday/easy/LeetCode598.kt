package com.guanhong.leetcodeeveryday.easy

class LeetCode598 {

    fun maxCount(m : Int, n : Int, ops : Array<IntArray>) : Int {

        var sameRow = m
        var sameColumn = n

        ops.forEach { intArray ->

            if (intArray[0] < sameRow) {

                sameRow = intArray[0]
            }
            if (intArray[1] < sameColumn) {

                sameColumn = intArray[1]
            }
        }

        return sameRow * sameColumn
    }
}