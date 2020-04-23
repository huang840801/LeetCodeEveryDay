package com.guanhong.leetcodeeveryday

import kotlin.math.max

class LeetCode949 {

    fun largestTimeFromDigits(A : IntArray) : String {

        var time = -1

        if (isValid(A[0], A[1], A[2], A[3])) time = max(time, ("" + A[0] + A[1] + A[2] + A[3]).toInt())
        if (isValid(A[0], A[1], A[3], A[2])) time = max(time, ("" + A[0] + A[1] + A[3] + A[2]).toInt())
        if (isValid(A[0], A[2], A[1], A[3])) time = max(time, ("" + A[0] + A[2] + A[1] + A[3]).toInt())
        if (isValid(A[0], A[2], A[3], A[1])) time = max(time, ("" + A[0] + A[2] + A[3] + A[1]).toInt())
        if (isValid(A[0], A[3], A[1], A[2])) time = max(time, ("" + A[0] + A[3] + A[1] + A[2]).toInt())
        if (isValid(A[0], A[3], A[2], A[1])) time = max(time, ("" + A[0] + A[3] + A[2] + A[1]).toInt())

        if (isValid(A[1], A[0], A[2], A[3])) time = max(time, ("" + A[1] + A[0] + A[2] + A[3]).toInt())
        if (isValid(A[1], A[0], A[3], A[2])) time = max(time, ("" + A[1] + A[0] + A[3] + A[2]).toInt())
        if (isValid(A[1], A[2], A[0], A[3])) time = max(time, ("" + A[1] + A[2] + A[0] + A[3]).toInt())
        if (isValid(A[1], A[2], A[3], A[0])) time = max(time, ("" + A[1] + A[2] + A[3] + A[0]).toInt())
        if (isValid(A[1], A[3], A[0], A[2])) time = max(time, ("" + A[1] + A[3] + A[0] + A[2]).toInt())
        if (isValid(A[1], A[3], A[2], A[0])) time = max(time, ("" + A[1] + A[3] + A[2] + A[0]).toInt())

        if (isValid(A[2], A[0], A[1], A[3])) time = max(time, ("" + A[2] + A[0] + A[1] + A[3]).toInt())
        if (isValid(A[2], A[0], A[3], A[1])) time = max(time, ("" + A[2] + A[0] + A[3] + A[1]).toInt())
        if (isValid(A[2], A[1], A[0], A[3])) time = max(time, ("" + A[2] + A[1] + A[0] + A[3]).toInt())
        if (isValid(A[2], A[1], A[3], A[0])) time = max(time, ("" + A[2] + A[1] + A[3] + A[0]).toInt())
        if (isValid(A[2], A[3], A[0], A[1])) time = max(time, ("" + A[2] + A[3] + A[0] + A[1]).toInt())
        if (isValid(A[2], A[3], A[1], A[0])) time = max(time, ("" + A[2] + A[3] + A[1] + A[0]).toInt())

        if (isValid(A[3], A[0], A[1], A[2])) time = max(time, ("" + A[3] + A[0] + A[1] + A[2]).toInt())
        if (isValid(A[3], A[0], A[2], A[1])) time = max(time, ("" + A[3] + A[0] + A[2] + A[1]).toInt())
        if (isValid(A[3], A[1], A[0], A[2])) time = max(time, ("" + A[3] + A[1] + A[0] + A[2]).toInt())
        if (isValid(A[3], A[1], A[2], A[0])) time = max(time, ("" + A[3] + A[1] + A[2] + A[0]).toInt())
        if (isValid(A[3], A[2], A[0], A[1])) time = max(time, ("" + A[3] + A[2] + A[0] + A[1]).toInt())
        if (isValid(A[3], A[2], A[1], A[0])) time = max(time, ("" + A[3] + A[2] + A[1] + A[0]).toInt())

        val timeString = time.toString()

        if (time == -1) return ""

        return when (timeString.count()) {

            1 -> "00:0$time"
            2 -> "00:$time"
            3 -> "0" + timeString[0] + ":" + timeString[1] + timeString[2]
            4 -> "" + timeString[0] + timeString[1] + ":" + timeString[2] + timeString[3]
            else -> "error"
        }
    }

    private fun isValid(a0 : Int, a1 : Int, a2 : Int, a3 : Int) : Boolean {

        if (("" + a2 + a3).toInt() > 59) return false
        if (("" + a0 + a1 + a2 + a3).toInt() > 2359) return false

        return true
    }
}