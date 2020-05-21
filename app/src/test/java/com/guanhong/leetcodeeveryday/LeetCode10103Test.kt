package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1103Test {

    private lateinit var leetCode : LeetCode1103

    @Before
    fun setUp() {

        leetCode = LeetCode1103()
    }

    @Test
    fun testDistributeCandies1() {

        val expected = intArrayOf(1, 0, 0, 0)
        val actual = leetCode.distributeCandies(1, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies2() {

        val expected = intArrayOf(1, 2, 2, 0)
        val actual = leetCode.distributeCandies(5, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies3() {

        val expected = intArrayOf(1, 2, 3, 3)
        val actual = leetCode.distributeCandies(9, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies4() {

        val expected = intArrayOf(2, 2, 3, 4)
        val actual = leetCode.distributeCandies(11, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies5() {

        val expected = intArrayOf(6, 2, 3, 4)
        val actual = leetCode.distributeCandies(15, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies6() {

        val expected = intArrayOf(6, 8, 10, 11)
        val actual = leetCode.distributeCandies(35, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies7() {

        val expected = intArrayOf(1, 2, 3, 1)
        val actual = leetCode.distributeCandies(7, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies8() {

        val expected = intArrayOf(5, 2, 3)
        val actual = leetCode.distributeCandies(10, 3)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDistributeCandies9() {

        val expected = intArrayOf(35)
        val actual = leetCode.distributeCandies(35, 1)

        assertArrayEquals(expected, actual)
    }
}