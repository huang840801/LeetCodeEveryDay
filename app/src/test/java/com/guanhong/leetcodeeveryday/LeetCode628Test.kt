package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode628
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode628Test {

    private lateinit var leetCode : LeetCode628

    @Before
    fun setUp() {

        leetCode = LeetCode628()
    }

    @Test
    fun testMaximumProduct1() {

        val actual = leetCode.maximumProduct(intArrayOf(1, 2, 3))
        val expected = 6

        assertEquals(expected, actual)
    }

    @Test
    fun testMaximumProduct2() {

        val actual = leetCode.maximumProduct(intArrayOf(2, 3, 4, 5))
        val expected = 60

        assertEquals(expected, actual)
    }

    @Test
    fun testMaximumProduct3() {

        val actual = leetCode.maximumProduct(intArrayOf(-1, 2, 3, 4))
        val expected = 24

        assertEquals(expected, actual)
    }

    @Test
    fun testMaximumProduct4() {

        val actual = leetCode.maximumProduct(intArrayOf(-1, -2, -3, 4))
        val expected = 24

        assertEquals(expected, actual)
    }

    @Test
    fun testMaximumProduct5() {

        val actual = leetCode.maximumProduct(intArrayOf(-1, -2, -3, -4))
        val expected = -6

        assertEquals(expected, actual)
    }

    @Test
    fun testMaximumProduct6() {

        val actual = leetCode.maximumProduct(intArrayOf(-1, -2, -3, 4, 5))
        val expected = 30

        assertEquals(expected, actual)
    }

    @Test
    fun testMaximumProduct7() {

        val actual = leetCode.maximumProduct(intArrayOf(-1, -2, -3, 4, 3, 5))
        val expected = 60

        assertEquals(expected, actual)
    }

    @Test
    fun testMaximumProduct8() {

        val actual = leetCode.maximumProduct(intArrayOf(-1, -2, -3, 4, 3, 4, 5))
        val expected = 80

        assertEquals(expected, actual)
    }

    @Test
    fun testMaximumProduct9() {

        val actual = leetCode.maximumProduct(intArrayOf(-7, -5, -3, 4, 1, 2, 6))
        val expected = 210

        assertEquals(expected, actual)
    }
}