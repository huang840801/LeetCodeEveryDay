package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode13Test {

    private lateinit var leetCode : LeetCode13

    @Before
    fun setUp() {

        leetCode = LeetCode13()
    }

    @Test
    fun testRomanToInt1() {

        val expected = 3
        val actual = leetCode.romanToInt("III")

        assertEquals(expected, actual)
    }

    @Test
    fun testRomanToInt2() {

        val expected = 4
        val actual = leetCode.romanToInt("IV")

        assertEquals(expected, actual)
    }

    @Test
    fun testRomanToInt3() {

        val expected = 9
        val actual = leetCode.romanToInt("IX")

        assertEquals(expected, actual)
    }

    @Test
    fun testRomanToInt4() {

        val expected = 58
        val actual = leetCode.romanToInt("LVIII")

        assertEquals(expected, actual)
    }

    @Test
    fun testRomanToInt5() {

        val expected = 1994
        val actual = leetCode.romanToInt("MCMXCIV")

        assertEquals(expected, actual)
    }

    @Test
    fun testRomanToInt6() {

        val expected = 2000
        val actual = leetCode.romanToInt("MM")

        assertEquals(expected, actual)
    }

    @Test
    fun testRomanToInt7() {

        val expected = 5
        val actual = leetCode.romanToInt("VX")

        assertEquals(expected, actual)
    }
}