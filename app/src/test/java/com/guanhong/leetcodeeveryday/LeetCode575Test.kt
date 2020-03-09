package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode575Test {

    private lateinit var leetCode : LeetCode575

    @Before
    fun setUp() {

        leetCode = LeetCode575()
    }

    @Test
    fun testDistributeCandies1() {

        val actual = leetCode.distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3, 5, 6, 8, 8, 9, 2))
        val expected = 6

        assertEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies2() {

        val actual = leetCode.distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3))
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies3() {

        val actual = leetCode.distributeCandies(intArrayOf(1, 1, 2, 3))
        val expected = 2

        assertEquals(expected, actual)
    }
}