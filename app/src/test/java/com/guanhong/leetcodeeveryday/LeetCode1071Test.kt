package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1071Test {

    private lateinit var leetCode : LeetCode1071

    @Before
    fun setUp() {

        leetCode = LeetCode1071()
    }

    @Test
    fun testGcdOfStrings1() {

        val expected = "ABC"
        val actual = leetCode.gcdOfStrings("ABCABC", "ABC")

        assertEquals(expected, actual)
    }

    @Test
    fun testGcdOfStrings2() {

        val expected = "AB"
        val actual = leetCode.gcdOfStrings("ABABAB", "ABAB")

        assertEquals(expected, actual)
    }

    @Test
    fun testGcdOfStrings3() {

        val expected = ""
        val actual = leetCode.gcdOfStrings("LEET", "CODE")

        assertEquals(expected, actual)
    }

    @Test
    fun testGcdOfStrings4() {

        val expected = ""
        val actual = leetCode.gcdOfStrings("LE", "CODE")

        assertEquals(expected, actual)
    }
}