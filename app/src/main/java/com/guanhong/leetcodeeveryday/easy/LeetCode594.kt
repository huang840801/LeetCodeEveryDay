package com.guanhong.leetcodeeveryday.easy

class LeetCode594 {

    fun findLHS(nums : IntArray) : Int {

        if (nums.isEmpty()) return 0

        val mutableMap = mutableMapOf<Int, Int>()

        var answer = 0

        val sortedNums = nums.sorted()

        sortedNums.forEach {

            if (mutableMap[it] == null) {

                mutableMap[it] = 1
            } else {

                mutableMap[it] = mutableMap[it]!! + 1
            }
        }

        var previousNum = sortedNums[0]
        var previousNumCount = mutableMap[sortedNums[0]]!!

        mutableMap.forEach {

            if (previousNum + 1 == it.key) {

                if (previousNumCount + it.value > answer) {

                    answer = previousNumCount + it.value
                }
            }

            previousNum = it.key
            previousNumCount = it.value
        }

        return answer
    }
}