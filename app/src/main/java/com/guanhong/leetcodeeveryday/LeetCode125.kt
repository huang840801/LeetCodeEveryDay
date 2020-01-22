package com.guanhong.leetcodeeveryday

class LeetCode125 {

    fun isPalindrome(s: String): Boolean {
        val str = s.filter { it.isLetterOrDigit() }.toLowerCase()
        return str == str.reversed()
    }
}