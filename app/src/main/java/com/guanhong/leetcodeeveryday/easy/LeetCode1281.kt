package com.guanhong.leetcodeeveryday.easy

class LeetCode1281 {

    fun subtractProductAndSum(n: Int): Int {

        val digitNumberOfN = calculateNumDigitNumber(n, 1)

        val numList = mutableListOf<Int>()

        for (i in 0 until digitNumberOfN) {

            numList.add((n / getTenPower(i)) % 10)
        }

        var allMultiple = 1

        numList.forEach {

            if (it == 0) {
                allMultiple = 0
                return@forEach
            }
            allMultiple *= it
        }

        val allSum = numList.sum()

        return allMultiple - allSum
    }

    fun getTenPower(num: Int): Int {

        if (num == 0) return 1

        var answer = 1

        for (i in 1..num) {

            answer *= 10
        }

        return answer
    }

    fun calculateNumDigitNumber(num: Int, digitNumber: Int): Int {

        if (num < 10) return digitNumber

        return calculateNumDigitNumber(num / 10, digitNumber + 1)
    }
}