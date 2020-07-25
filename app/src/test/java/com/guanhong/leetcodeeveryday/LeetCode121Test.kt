package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode121
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode121Test {

    private lateinit var leetCode121 : LeetCode121

    @Before
    fun setUp() {

        leetCode121 = LeetCode121()
    }

    @Test
    fun testMaxProfit1() {

        val actual = leetCode121.maxProfit(intArrayOf(7, 3, 1, 5, 2))
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit2() {

        val actual = leetCode121.maxProfit(intArrayOf(3, 1, 5, 2))
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit3() {

        val actual = leetCode121.maxProfit(intArrayOf(1, 5, 2))
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit4() {

        val actual = leetCode121.maxProfit(intArrayOf(1))
        val expected = 0

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit5() {

        val actual = leetCode121.maxProfit(intArrayOf(1, 2, 3))
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit6() {

        val actual = leetCode121.maxProfit(intArrayOf(3, 2, 1))
        val expected = 0

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit7() {

        val actual = leetCode121.maxProfit(intArrayOf(7, 6, 4, 3, 1))
        val expected = 0

        assertEquals(expected, actual)
    }
}