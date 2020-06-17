package com.guanhong.leetcodeeveryday

import java.lang.StringBuilder

class LeetCode1332 {

    fun removePalindromeSub(s : String) : Int {

        if (s.isEmpty()) return 0

        return if (s == s.reversed()) 1 else 2
    }
}