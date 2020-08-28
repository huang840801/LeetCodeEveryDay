package com.guanhong.leetcodeeveryday.easy

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1556Test {

    private lateinit var leetCode : LeetCode1556

    @Before
    fun setUp() {

        leetCode = LeetCode1556()
    }

    @Test
    fun test1() {

        val expected = "987"

        val actual = leetCode.thousandSeparator(987)

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {

        val expected = "1.987"

        val actual = leetCode.thousandSeparator(1987)

        assertEquals(expected, actual)
    }

    @Test
    fun test3() {

        val expected = "123.456.789"

        val actual = leetCode.thousandSeparator(123456789)

        assertEquals(expected, actual)
    }
}