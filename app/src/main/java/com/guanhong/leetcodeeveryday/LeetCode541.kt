package com.guanhong.leetcodeeveryday

class LeetCode541 {

    fun reverseStr(s : String, k : Int) : String {

        if (s.length <= k) return s.reversed()

        var answer = ""
        var temp = ""
        var count = 0
        var isNeedToReversed = true

        s.forEach {

            count++

            if (isNeedToReversed) {

                temp += it

                if (count == k) {

                    answer += temp.reversed()

                    count = 0
                    temp = ""
                    isNeedToReversed = !isNeedToReversed
                }
            } else {

                answer += it

                if (count == k) {

                    count = 0

                    isNeedToReversed = !isNeedToReversed
                }
            }
        }

        return if (temp == "") {

            answer
        } else {
            answer + temp.reversed()
        }
    }
}