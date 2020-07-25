package com.guanhong.leetcodeeveryday.easy

class LeetCode88 {

    fun merge(nums1 : IntArray, m : Int, nums2 : IntArray, n : Int) {

        val mutableList = mutableListOf<Int>()

        for (index in 0 until m) {

            mutableList.add(nums1[index])
        }
        for (index in 0 until n) {

            mutableList.add(nums2[index])
        }

        val sortedList = mutableList.sorted()

        for (index in 0 until nums1.count()) {

            nums1[index] = sortedList[index]
        }
    }
}