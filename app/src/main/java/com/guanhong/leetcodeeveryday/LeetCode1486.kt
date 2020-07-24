package com.guanhong.leetcodeeveryday

class LeetCode1486 {

    fun xorOperation(n : Int, start : Int) : Int {

        var answer = start

        (1 until n).forEach { int ->

            answer = answer xor (2 * int + start)
        }

        return answer
    }
}