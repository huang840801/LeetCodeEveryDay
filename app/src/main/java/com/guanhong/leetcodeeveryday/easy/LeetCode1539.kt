package com.guanhong.leetcodeeveryday.easy

class LeetCode1539 {

    fun findKthPositive(arr : IntArray, k : Int) : Int {

        val mutableList = mutableListOf<Int>()

        for (index in 1..arr.last()) {

            if (!arr.contains(index)) {

                mutableList.add(index)
            }
        }

        return if (mutableList.count() >= k) {

            mutableList[k - 1]
        } else {

            arr.last() + k - mutableList.count()
        }
    }
}