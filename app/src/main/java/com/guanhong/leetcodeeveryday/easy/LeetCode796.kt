package com.guanhong.leetcodeeveryday.easy

class LeetCode796 {

    fun rotateString(A : String, B : String) : Boolean {

        if (A.isEmpty() && B.isEmpty()) return true

        var shiftTime = 0
        var a = A
        var temp : Char

        while (shiftTime < a.length) {

            if (a == B) {

                return true
            }

            temp = a[0]

            a = a.drop(1)
            a += temp

            shiftTime++
        }

        return false
    }
}