package com.guanhong.leetcodeeveryday.medium

class LeetCode347 {

    fun topKFrequent(nums : IntArray, k : Int) : IntArray {

        if (nums.isEmpty()) {

            return intArrayOf()
        }

        val map = mutableMapOf<Int, Int>()

        nums.forEach {

            if (map[it] == null) {

                map[it] = 1
            } else {

                map[it] = map[it]!! + 1
            }
        }

        val list = mutableListOf<Int>()

        for (num in 1..k) {

            val max = map.findMaxAndDelete()

            list.add(max)
        }

        return list.toIntArray()
    }

    fun MutableMap<Int, Int>.findMaxAndDelete() : Int {

        var maxValue = Int.MIN_VALUE
        var key = -1

        this.forEach {

            if (it.value > maxValue) {

                maxValue = it.value
                key = it.key
            }
        }

        this[key] = 0

        return key
    }
}