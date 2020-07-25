package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.medium.LeetCode18
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode18Test {

    private lateinit var leetCode : LeetCode18

    @Before
    fun setUp() {

        leetCode = LeetCode18()
    }

    @Test
    fun testFourSum1() {

        val expected = listOf(
            listOf(-1, 0, 0, 1),
            listOf(-2, -1, 1, 2),
            listOf(-2, 0, 0, 2)
        )
        val actual = leetCode.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)

        assertEquals(expected, actual)
    }

    @Test
    fun testFourSum2() {

        val expected = listOf(
            listOf(-3, -1, 0, 4)
        )
        val actual = leetCode.fourSum(intArrayOf(-3, -1, 0, 2, 4, 5), 0)

        assertEquals(expected, actual)
    }

    @Test
    fun testFourSum3() {

        val expected = listOf(
            listOf(-3, -1, 0, 4)
        )
        val actual = leetCode.fourSum(intArrayOf(-3, -1, 0, 4), 0)

        assertEquals(expected, actual)
    }
}