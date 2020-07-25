package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode409
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode409Test {

    private lateinit var leetCode : LeetCode409

    @Before
    fun setUp() {

        leetCode = LeetCode409()
    }

    @Test
    fun testLongestPalindrome1() {

        val actual = leetCode.longestPalindrome("uu")
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testLongestPalindrome2() {

        val actual = leetCode.longestPalindrome("uuu")
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testLongestPalindrome3() {

        val actual = leetCode.longestPalindrome("abccccdd")
        val expected = 7

        assertEquals(expected, actual)
    }

    @Test
    fun testLongestPalindrome4() {

        val actual = leetCode.longestPalindrome("aA")
        val expected = 1

        assertEquals(expected, actual)
    }
}