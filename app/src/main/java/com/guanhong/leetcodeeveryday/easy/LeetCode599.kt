package com.guanhong.leetcodeeveryday.easy

class LeetCode599 {

    fun findRestaurant(list1 : Array<String>, list2 : Array<String>) : Array<String> {

        val mutableMap = mutableMapOf<String, Int>()

        val mutableSet = mutableSetOf<String>()

        var minNum = 2147483647

        list2.forEachIndexed { index, s ->

            if (list1.contains(s)) {

                if (mutableMap[s] == null) {

                    mutableMap[s] = index + list1.indexOf(s)
                } else {

                    mutableMap[s] = mutableMap[s]!! + index
                }
            }
        }

        mutableMap.forEach {

            if (it.value <= minNum) {

                if (it.value < minNum) {

                    mutableSet.clear()

                    minNum = it.value
                }
                mutableSet.add(it.key)
            }
        }
        return mutableSet.toTypedArray()
    }
}