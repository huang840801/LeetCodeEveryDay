package com.guanhong.leetcodeeveryday

class LeetCode961 {

    fun repeatedNTimes(A : IntArray) : Int {

        val mutableMap = mutableMapOf<Int, Int>()

        A.forEach {

            if (mutableMap[it] == null) {

                mutableMap[it] = 1
            } else {

                return it
            }
        }

        return 999
    }
}