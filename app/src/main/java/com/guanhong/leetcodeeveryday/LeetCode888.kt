package com.guanhong.leetcodeeveryday

class LeetCode888 {

    fun fairCandySwap(A : IntArray, B : IntArray) : IntArray {

        val sumA = A.sum()
        val sumB = B.sum()

        A.forEach { a ->

            B.forEach { b ->

                if ((sumA - a + b) == (sumB - b + a)) {

                    return intArrayOf(a, b)
                }
            }
        }

        return intArrayOf()
    }
}