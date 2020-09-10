package com.guanhong.leetcodeeveryday.medium

class LeetCode137 {

    fun singleNumber(A : IntArray) : Int {

        val map = mutableMapOf<Int, Int>()

        A.forEach {

            if (map[it] == null) {

                map[it] = 1
            } else {

                map[it] = map[it]!! + 1
            }
        }

        map.forEach {

            if (it.value == 1) {

                return it.key
            }
        }
        return -1
    }
}