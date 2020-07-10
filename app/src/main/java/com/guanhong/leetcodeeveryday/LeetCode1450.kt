package com.guanhong.leetcodeeveryday

class LeetCode1450 {

    fun busyStudent(startTime : IntArray, endTime : IntArray, queryTime : Int) : Int {

        var answer = 0

        (0 until startTime.count()).forEach { index ->

            if (queryTime in startTime[index]..endTime[index]) {

                answer++
            }
        }

        return answer
    }
}