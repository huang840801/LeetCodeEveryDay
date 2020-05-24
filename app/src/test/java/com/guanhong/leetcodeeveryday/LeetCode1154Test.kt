package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1154Test {

    private lateinit var leetCode : LeetCode1154

    @Before
    fun setUp() {

        leetCode = LeetCode1154()
    }

    @Test
    fun testDayOfYear1() {

        val expected = 9
        val actual = leetCode.dayOfYear("2019-01-09")

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfYear2() {

        val expected = 41
        val actual = leetCode.dayOfYear("2019-02-10")

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfYear3() {

        val expected = 60
        val actual = leetCode.dayOfYear("2003-03-01")

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfYear4() {

        val expected = 61
        val actual = leetCode.dayOfYear("2004-03-01")

        assertEquals(expected, actual)
    }
}