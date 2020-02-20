package com.guanhong.leetcodeeveryday

class LeetCode1346 {

    fun checkIfExist(arr : IntArray) : Boolean {

        val mutableMap = mutableMapOf<Int, Int>()

        val sortArr = arr.sorted()

        var i = 0
        var j = sortArr.count() - 1

        var num = 0

        while (num < sortArr.count()) {

            if (mutableMap.containsKey(sortArr[i] * 2) ||
                mutableMap.containsKey(sortArr[j] * 2) &&
                sortArr[i] != 0 &&
                sortArr[j] != 0
            ) {
                return true
            }

            mutableMap[sortArr[i]] = sortArr[i]
            mutableMap[sortArr[j]] = sortArr[j]

            if (j >= 1 && sortArr[j - 1] >= 0) j--
            if (i <= sortArr.count() - 2 && sortArr[i + 1] < 0) i++

            num++
        }

        return false
    }
}