package com.guanhong.leetcodeeveryday

import kotlin.math.abs

class LeetCode1200 {

    fun minimumAbsDifference(arr : IntArray) : List<List<Int>> {

        val sortedArray = arr.sorted()
        val answer = mutableListOf(listOf(sortedArray[0], sortedArray[1]))

        for (index in 1 until sortedArray.count() - 1) {

            val abs = abs(sortedArray[index + 1] - sortedArray[index])

            val answerAbs = abs(answer.first()[1] - answer.first()[0])

            if (abs < answerAbs) {

                answer.clear()

                answer.add(listOf(sortedArray[index], sortedArray[index + 1]))
            } else if (abs == answerAbs) {

                answer.add(listOf(sortedArray[index], sortedArray[index + 1]))
            }
        }

        return answer
    }
}
