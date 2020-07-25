package com.guanhong.leetcodeeveryday.easy

class LeetCode349 {

    fun intersection(nums1 : IntArray, nums2 : IntArray) : IntArray {

        val map = mutableMapOf<Int, Int>()
        val mutableMap = mutableMapOf<Int, Int>()

        nums1.forEach {

            if (mutableMap[it] == null) {

                mutableMap[it] = it
            }
        }

        nums2.forEach {

            if (mutableMap.containsKey(it)) {

                map[it] = it
            }
        }

        val answer = IntArray(map.count())

        var i = 0
        map.forEach {

            answer[i] = it.value
            i++
        }

        return answer
    }
}