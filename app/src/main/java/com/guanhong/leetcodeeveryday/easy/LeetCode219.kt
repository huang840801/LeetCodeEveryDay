package com.guanhong.leetcodeeveryday.easy

class LeetCode219 {

    fun containsNearbyDuplicate(nums : IntArray, k : Int) : Boolean {

        val mutableMap = mutableMapOf<Int, MutableList<Int>>()

        nums.forEachIndexed { index, num ->

            if (mutableMap.containsKey(num)) {

                mutableMap[num]!!.forEach {

                    if (index - it <= k) {

                        return true
                    }
                }
            }

            if (mutableMap[num] == null) {

                mutableMap[num] = mutableListOf(index)
            } else {

                mutableMap[num]!!.add(index)
            }
        }

        return false
    }
}