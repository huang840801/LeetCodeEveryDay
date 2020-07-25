package com.guanhong.leetcodeeveryday.easy

class LeetCode961 {

    fun repeatedNTimes(A : IntArray) : Int {

        val array = IntArray(10000) { 0 }

        A.forEach {

            if (array[it] == 0) {

                array[it] = 1
            } else {

                return it
            }
        }

        return 999
    }
}