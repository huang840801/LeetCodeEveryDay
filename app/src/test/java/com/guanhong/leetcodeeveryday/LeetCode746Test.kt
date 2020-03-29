package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode746Test {

    private lateinit var leetCode : LeetCode746

    @Before
    fun setUp() {

        leetCode = LeetCode746()
    }

    @Test
    fun testMinCostClimbingStairs1() {

        val actual = leetCode.minCostClimbingStairs(intArrayOf(1, 1, 1))
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testMinCostClimbingStairs2() {

        val actual = leetCode.minCostClimbingStairs(intArrayOf(10, 15, 20))
        val expected = 15

        assertEquals(expected, actual)
    }

    @Test
    fun testMinCostClimbingStairs3() {

        val actual = leetCode.minCostClimbingStairs(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1))
        val expected = 6

        assertEquals(expected, actual)
    }

    @Test
    fun testMinCostClimbingStairs4() {

        val actual = leetCode.minCostClimbingStairs(intArrayOf(1, 1, 1, 3, 2, 1, 4, 55, 6))
        val expected = 14

        assertEquals(expected, actual)
    }

    @Test
    fun testMinCostClimbingStairs5() {

        val actual = leetCode.minCostClimbingStairs(intArrayOf(1, 1, 1, 2, 2, 1, 4, 55, 6))

        println("  " + intArrayOf(1, 1, 1, 3, 2, 1, 4, 55, 6).toList().reversed())

        val expected = 14

        assertEquals(expected, actual)
    }

    @Test
    fun testMinCostClimbingStairs6() {

        val actual = leetCode.minCostClimbingStairs(intArrayOf(1, 1, 1, 0))
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testMinCostClimbingStairs7() {

        val actual = leetCode.minCostClimbingStairs(intArrayOf(2, 2, 1, 0))
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testMinCostClimbingStairs8() {

        val actual = leetCode.minCostClimbingStairs(intArrayOf(6, 55, 4, 1, 2, 2, 1, 1, 1))
        val expected = 14

        assertEquals(expected, actual)
    }
}