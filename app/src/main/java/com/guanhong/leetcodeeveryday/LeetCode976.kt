package com.guanhong.leetcodeeveryday

class LeetCode976 {

    fun largestPerimeter(A : IntArray) : Int {

        val sortArray = A.sorted()

        for (index in sortArray.lastIndex downTo 2) {

            if (sortArray[index - 1] + sortArray[index - 2] > sortArray[index]) {

                return sortArray[index] + sortArray[index - 1] + sortArray[index - 2]
            }
        }

        return 0
    }
}