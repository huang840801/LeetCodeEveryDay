package com.guanhong.leetcodeeveryday.easy

class LeetCode1512 {

    fun numIdenticalPairs(nums : IntArray) : Int {

        val map = mutableMapOf<Int, Int>()

        var answer = 0

        nums.forEach {

            if (map[it] == null) {

                map[it] = 1
            } else {

                map[it] = map[it]!! + 1
            }
        }

        map.forEach {

            if (it.value > 1) {

                answer += it.value * (it.value - 1) / 2
            }
        }

        return answer
    }
}