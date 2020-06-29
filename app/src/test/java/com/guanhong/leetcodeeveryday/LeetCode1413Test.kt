package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1413Test {

    private lateinit var leetCode : LeetCode1413

    @Before
    fun setUp() {

        leetCode = LeetCode1413()
    }

    @Test
    fun testMinStartValue1() {

        val expected = 5
        val actual = leetCode.minStartValue(intArrayOf(-3, 2, -3, 4, 2))

        assertEquals(expected, actual)
    }

    @Test
    fun testMinStartValue2() {

        val expected = 1
        val actual = leetCode.minStartValue(intArrayOf(1, 2))

        assertEquals(expected, actual)
    }

    @Test
    fun testMinStartValue3() {

        val expected = 5
        val actual = leetCode.minStartValue(intArrayOf(1, -2, -3))

        assertEquals(expected, actual)
    }
}