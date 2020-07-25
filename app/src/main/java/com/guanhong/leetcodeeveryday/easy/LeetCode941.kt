package com.guanhong.leetcodeeveryday.easy

class LeetCode941 {

    fun validMountainArray(A : IntArray) : Boolean {

        if (A.count() < 3) return false
        if (A[0] >= A[1]) return false

        val maxIndex = A.indexOf(A.max()!!)

        if (maxIndex == 0 || maxIndex == A.lastIndex) return false

        var pre = A[0]

        for (index in 1 until A.count()) {

            when {

                (index < maxIndex) -> {

                    if (A[index] <= pre) {

                        return false
                    }
                }
                (index > maxIndex) -> {

                    if (A[index] >= pre) {

                        return false
                    }
                }

                else -> {
                }
            }

            pre = A[index]
        }

        return true
    }
}