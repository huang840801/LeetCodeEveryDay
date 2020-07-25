package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode122
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode122Test {

    private lateinit var leetCode : LeetCode122

    @Before
    fun setUp() {

        leetCode = LeetCode122()
    }

    @Test
    fun testMaxProfit11111() {

        val expected = 12
        val actual = leetCode.maxProfit(intArrayOf(7, 5, 1, 2, 3, 4, 2, 1, 1, 2, 3, 8, 4, 3, 5))

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit1() {

        val expected = 7
        val actual = leetCode.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit2() {

        val expected = 4
        val actual = leetCode.maxProfit(intArrayOf(1, 2, 3, 4, 5))

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit3() {

        val expected = 0
        val actual = leetCode.maxProfit(intArrayOf(7, 6, 4, 3, 1))

        assertEquals(expected, actual)
    }
}