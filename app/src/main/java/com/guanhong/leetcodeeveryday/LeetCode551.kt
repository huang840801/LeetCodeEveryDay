package com.guanhong.leetcodeeveryday

class LeetCode551 {

    fun checkRecord(s : String) : Boolean {

        return !(s.count { it == 'A' } > 1 || s.contains("LLL"))
    }
}