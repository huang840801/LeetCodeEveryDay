package com.guanhong.leetcodeeveryday

import kotlin.math.sqrt

class LeetCode762 {

    fun countPrimeSetBits(L : Int, R : Int) : Int {

        var answer = 0

        for (num in L..R) {

            var bitCount = 0

            val binaryString = decimalToBinary(num)

            binaryString.forEach {

                if (it == '1') {

                    bitCount++
                }
            }

            if (isPrime(bitCount)) {

                answer++
            }
        }

        return answer
    }

    fun isPrime(num : Int) : Boolean {

        if (num < 2) return false
        else {

            for (i in 2..sqrt(num.toDouble()).toInt()) {

                if (num % i == 0) {

                    return false
                }
            }
        }

        return true
    }

    fun decimalToBinary(decimal : Int) : String {

        return if (decimal < 2) {

            decimal.toString()
        } else {

            decimalToBinary(decimal / 2) + decimalToBinary(decimal % 2)
        }
    }
}