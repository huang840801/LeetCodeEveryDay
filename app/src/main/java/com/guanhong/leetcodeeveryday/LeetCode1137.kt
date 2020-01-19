package com.guanhong.leetcodeeveryday

class LeetCode1137 {

    // 0 <= n <= 37
    fun tribonacci(n : Int) : Int {

        return when (n) {

            0 -> 0
            1 -> 1
            2 -> 1
            else -> {

                var answer = 0
                var n1 = 0
                var n2 = 1
                var n3 = 1

                for (i in 0..(n - 3)) {

                    answer = n1 + n2 + n3

                    n1 = n2
                    n2 = n3
                    n3 = answer
                }

                answer
            }
        }
    }
}