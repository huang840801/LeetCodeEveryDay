package com.guanhong.leetcodeeveryday.medium

class LeetCode56 {

    fun merge(intervals : Array<IntArray>) : Array<IntArray> {

        if (intervals.isEmpty()) {

            return arrayOf()
        }

        intervals.sortBy { it[0] }

        val answer = mutableListOf<IntArray>()

        val temp = intArrayOf(intervals[0][0], intervals[0][1])

        intervals.forEachIndexed { index, intArray ->

            if (index > 0) {

                if (intArray[0] > temp[1]) {

                    answer.add(intArrayOf(temp[0], temp[1]))

                    temp[0] = intArray[0]
                    temp[1] = intArray[1]
                } else {

                    if (temp[1] < intArray[1]) {

                        temp[1] = intArray[1]
                    }
                }
            }
        }

        answer.add(temp)

        return answer.toTypedArray()
    }
}