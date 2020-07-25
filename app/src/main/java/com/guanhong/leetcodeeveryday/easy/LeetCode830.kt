package com.guanhong.leetcodeeveryday.easy

class LeetCode830 {

    fun largeGroupPositions(S : String) : List<List<Int>> {

        var continuousCount = 1
        var preIndex = 0

        val ans = mutableListOf<List<Int>>()

        for (index in 1 until S.length) {

            if (S[index] == S[index - 1]) {

                continuousCount++

                if (continuousCount == 2) {
                    preIndex = index - 1
                }
            } else {

                if (continuousCount > 2) {

                    ans.add(listOf(preIndex, index - 1))
                }

                continuousCount = 1
            }
        }

        if (continuousCount > 2) {

            ans.add(listOf(preIndex, S.length - 1))
        }

        return ans
    }
}