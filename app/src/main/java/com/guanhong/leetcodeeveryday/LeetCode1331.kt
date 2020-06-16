package com.guanhong.leetcodeeveryday

class LeetCode1331 {

    fun arrayRankTransform(arr : IntArray) : IntArray {

        if (arr.isEmpty()) return intArrayOf()

        val answer = arr.clone()
        val sortedArray = arr.sorted()

        var pre = sortedArray[0]

        var rank = 1

        val map = mutableMapOf<Int, Int>()

        map[pre] = 1

        sortedArray.forEach {

            if (pre != it) {

                rank++
                map[it] = rank
            }

            pre = it
        }

        for (index in 0 until answer.count()) {

            val thisRank = map[answer[index]]!!

            answer[index] = thisRank
        }

        return answer
    }
}