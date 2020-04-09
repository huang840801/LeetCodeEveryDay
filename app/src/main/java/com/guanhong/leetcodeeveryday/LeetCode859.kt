package com.guanhong.leetcodeeveryday

class LeetCode859 {

    fun buddyStrings(A : String, B : String) : Boolean {

        if (A.length != B.length) return false

        var diff = 0
        var count = 0

        val letters = IntArray(256)

        for (i in 0 until A.length) {

            letters[A[i].toInt()]++

            if (A[i] != B[i]) {
                diff += A[i] - B[i]
                count++
            }
        }
        if (A == B) {
            for (int in letters) {
                if (int > 1)
                    return true
            }
        }

        return count == 2 && diff == 0
    }
}