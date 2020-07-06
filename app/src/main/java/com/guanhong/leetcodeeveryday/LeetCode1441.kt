package com.guanhong.leetcodeeveryday

class LeetCode1441 {

    fun buildArray(target : IntArray, n : Int) : List<String> {

        var index = 1
        var targetIndex = 0

        val mutableList = mutableListOf<String>()

        while (targetIndex <= target.lastIndex) {

            mutableList.add("Push")

            if (index == target[targetIndex]) {

                targetIndex++
            } else {

                mutableList.add("Pop")
            }

            index++
        }

        return mutableList
    }
}