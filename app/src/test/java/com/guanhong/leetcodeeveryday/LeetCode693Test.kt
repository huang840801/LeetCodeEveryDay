package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode693
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode693Test {

    private lateinit var leetCode : LeetCode693

    @Before
    fun setUp() {

        leetCode = LeetCode693()
    }
    @Test
    fun testDecimalToBinary1() {

        val actual = leetCode.decimalToBinary(3)
        val expected = "11"

        assertEquals(expected, actual)
    }

    @Test
    fun testDecimalToBinary2() {

        val actual = leetCode.decimalToBinary(4)
        val expected = "100"

        assertEquals(expected, actual)
    }

    @Test
    fun testDecimalToBinary3() {

        val actual = leetCode.decimalToBinary(5)
        val expected = "101"

        assertEquals(expected, actual)
    }

    @Test
    fun testHasAlternatingBits1() {

        val actual = leetCode.hasAlternatingBits(5)

        assertTrue(actual)
    }
    @Test
    fun testHasAlternatingBits2() {

        val actual = leetCode.hasAlternatingBits(7)

        assertFalse(actual)
    }
    @Test
    fun testHasAlternatingBits3() {

        val actual = leetCode.hasAlternatingBits(11)

        assertFalse(actual)
    }
}