package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1005Test {

    private lateinit var leetCode : LeetCode1005

    @Before
    fun setUp() {

        leetCode = LeetCode1005()
    }

    @Test
    fun testLargestSumAfterKNegations1() {

        val expected = 5
        val actual = leetCode.largestSumAfterKNegations(intArrayOf(2, 3, 4), 1)

        assertEquals(expected, actual)
    }

    @Test
    fun testLargestSumAfterKNegations2() {

        val expected = 6
        val actual = leetCode.largestSumAfterKNegations(intArrayOf(0, -1, 2, 3), 3)

        assertEquals(expected, actual)
    }

    @Test
    fun testLargestSumAfterKNegations3() {

        val expected = 1
        val actual = leetCode.largestSumAfterKNegations(intArrayOf(-1, -2), 3)

        assertEquals(expected, actual)
    }

    @Test
    fun testLargestSumAfterKNegations4() {

        val expected = 12
        val actual = leetCode.largestSumAfterKNegations(intArrayOf(-1, -2, -5, -6), 3)

        assertEquals(expected, actual)
    }
}