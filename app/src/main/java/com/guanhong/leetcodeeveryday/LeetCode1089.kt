package com.guanhong.leetcodeeveryday

class LeetCode1089 {

    fun duplicateZeros(arr : IntArray) : Unit {

        var index = 0

        while (index < arr.count()) {

            if (arr[index] == 0) {

                for (index1 in arr.lastIndex downTo index + 1) {

                    arr[index1] = arr[index1 - 1]
                }

                index += 2
            } else {

                index++
            }
        }
    }
}