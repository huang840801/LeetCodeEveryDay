package com.guanhong.leetcodeeveryday

import org.junit.Before
import org.junit.Assert.*
import org.junit.Test

class LeetCode1281Test {

    private lateinit var leetCode1281: LeetCode1281

    @Before
    fun setUp() {

        leetCode1281 = LeetCode1281()
    }

    @Test
    fun testCalculateNumDigitNumber() {

        val actual = leetCode1281.calculateNumDigitNumber(10, 1)

        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testSubtractProductAndSum() {

        val actual = leetCode1281.subtractProductAndSum(4421)

        val expected = 21

        assertEquals(expected, actual)
    }
}