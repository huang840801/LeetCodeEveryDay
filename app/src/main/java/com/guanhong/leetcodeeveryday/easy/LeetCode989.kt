package com.guanhong.leetcodeeveryday.easy

import kotlin.math.max

class LeetCode989 {

    fun addToArrayForm(A : IntArray, K : Int) : List<Int> {

        val answer = mutableListOf<Int>()

        val kList = mutableListOf<Int>()

        K.toString().forEach {

            kList.add(it.toString().toInt())
        }

        val countK = kList.count()
        val countA = A.count()

        var arrayK = IntArray(max(countK, countA)) { 0 }
        var arrayA = IntArray(max(countK, countA)) { 0 }

        if (countK > countA) {

            arrayK = kList.toIntArray()

            var arrayIndex = countK - 1

            for (index in A.lastIndex downTo 0) {

                arrayA[arrayIndex] = A[index]
                arrayIndex--
            }
        } else {

            arrayA = A

            var arrayIndex = countA - 1

            for (index in kList.lastIndex downTo 0) {

                arrayK[arrayIndex] = kList[index]
                arrayIndex--
            }
        }

        var isCarry = false

        for (index in arrayA.lastIndex downTo 0) {

            val sum = if (isCarry) {

                arrayA[index] + arrayK[index] + 1
            } else {
                arrayA[index] + arrayK[index]
            }

            if (sum > 9) {

                isCarry = true
                answer.add(sum % 10)
            } else {

                isCarry = false
                answer.add(sum)
            }
        }

        if (isCarry) {

            answer.add(1)
        }

        return answer.reversed()
    }
}