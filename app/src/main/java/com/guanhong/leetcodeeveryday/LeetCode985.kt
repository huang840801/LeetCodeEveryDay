package com.guanhong.leetcodeeveryday

class LeetCode985 {

    fun sumEvenAfterQueries(A : IntArray, queries : Array<IntArray>) : IntArray {

        val answer = IntArray(queries.count())

        var evenSum = 0

        A.forEach {

            if (it % 2 == 0) {

                evenSum += it
            }
        }
        queries.forEachIndexed { index, it ->

            val queriesValue = it[0]
            val queriesIndex = it[1]

            if (A[queriesIndex] % 2 == 0) {

                evenSum -= A[queriesIndex]
            }

            val newNum = A[queriesIndex] + queriesValue

            if (newNum % 2 == 0) {

                evenSum += newNum
            }

            answer[index] = evenSum

            A[queriesIndex] = newNum
        }

        return answer
    }
}