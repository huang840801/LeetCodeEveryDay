package com.guanhong.leetcodeeveryday.easy

class LeetCode1170 {

    fun numSmallerByFrequency(queries : Array<String>, words : Array<String>) : IntArray {

        val answer = IntArray(queries.count())

        val queryFrequencyList = queries.map { getFrequency(it) }
        val wordsFrequencyList = words.map { getFrequency(it) }

        for (index in 0 until queries.count()) {

            val queryFrequency = queryFrequencyList[index]

            var sum = 0

            wordsFrequencyList.forEach {

                if (it > queryFrequency) {

                    sum += 1
                }
            }

            answer[index] = sum
        }

        return answer
    }

    fun getFrequency(string : String) : Int {

        var frequency = 0

        var smallerChar = 'z'

        string.forEach {

            if (smallerChar > it) {

                smallerChar = it
            }
        }

        string.forEach {

            if (it == smallerChar) {

                frequency += 1
            }
        }

        return frequency
    }
}