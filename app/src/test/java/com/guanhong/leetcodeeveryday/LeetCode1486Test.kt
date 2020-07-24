package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1486Test {

    private lateinit var leetCode : LeetCode1486

    @Before
    fun setUp() {

        leetCode = LeetCode1486()
    }

    @Test
    fun testXorOperation1() {

        val expected = 8
        val actual = leetCode.xorOperation(5, 0)

        assertEquals(expected, actual)
    }

    @Test
    fun testXorOperation2() {

        val expected = 8
        val actual = leetCode.xorOperation(4, 3)

        assertEquals(expected, actual)
    }

    @Test
    fun testXorOperation3() {

        val expected = 7
        val actual = leetCode.xorOperation(1, 7)

        assertEquals(expected, actual)
    }

    @Test
    fun testXorOperation4() {

        val expected = 2
        val actual = leetCode.xorOperation(10, 5)

        assertEquals(expected, actual)
    }

    @Test
    fun testXorOperation5() {

        val expected = 0
        val actual = leetCode.xorOperation(1, 0)

        assertEquals(expected, actual)
    }
}