package com.guanhong.leetcodeeveryday.easy

class LeetCode1394 {

    fun findLucky(arr : IntArray) : Int {

        val map = mutableMapOf<Int, Int>()

        arr.forEach {

            if (map[it] == null) {

                map[it] = 1
            } else {

                map[it] = map[it]!! + 1
            }
        }

        var answer = -1

        map.forEach {

            if (it.key == it.value && it.key > answer) {

                answer = it.key
            }
        }

        return answer
    }
}