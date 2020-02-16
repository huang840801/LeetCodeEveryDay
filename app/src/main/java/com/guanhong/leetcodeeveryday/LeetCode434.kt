package com.guanhong.leetcodeeveryday

class LeetCode434 {

    fun countSegments(s : String) : Int {

        var answer = 0
        var isSegment = false

        s.forEach {

            if (it != ' ') {

                isSegment = true
            } else if (isSegment) {

                isSegment = false
                answer += 1
            }
        }

        return if (isSegment) {
            answer + 1
        } else {
            answer
        }
    }
}