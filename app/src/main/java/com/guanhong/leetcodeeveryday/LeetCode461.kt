package com.guanhong.leetcodeeveryday

class LeetCode461 {

    fun hammingDistance(x : Int, y : Int) : Int {

        return Integer.bitCount(x xor y)
    }
}