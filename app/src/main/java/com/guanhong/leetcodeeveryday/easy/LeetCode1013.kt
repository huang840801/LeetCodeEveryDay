package com.guanhong.leetcodeeveryday.easy

class LeetCode1013 {

    fun canThreePartsEqualSum(A : IntArray) : Boolean {

        var firstTotal = 0
        var secondTotal = 0
        var thirdTotal = 0

        var total = 0
        val target : Int

        A.forEach { i ->

            total += i
        }

        if (total % 3 != 0) return false

        target = total / 3

        A.forEach { num ->

            if (firstTotal != target) {

                firstTotal += num
            } else {

                if (secondTotal != target) {

                    secondTotal += num
                } else {

                    if (thirdTotal != target) {

                        thirdTotal += num
                    }
                }
            }
        }

        return (firstTotal == secondTotal && secondTotal == thirdTotal)
    }
}