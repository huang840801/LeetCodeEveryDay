package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode15Test {

    private lateinit var leetCode15 : LeetCode15

    @Before
    fun setUp() {

        leetCode15 = LeetCode15()
    }

    @Test
    fun testThreeSum1() {

        val actual = leetCode15.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        val expected = listOf(listOf(-1, 0, 1), listOf(-1, -1, 2))

        expected[0].sorted()
        assertEquals(expected.count(), actual.count())
        assertArrayEquals(expected[0].toIntArray(), actual[0].sorted().toIntArray())
        assertArrayEquals(expected[1].toIntArray(), actual[1].sorted().toIntArray())
    }

    @Test
    fun testThreeSum2() {

        val actual = leetCode15.threeSum(intArrayOf(2, -1, -4))

        val expected = 0

        assertEquals(expected, actual.count())
    }

    @Test
    fun testThreeSum3() {

        val actual = leetCode15.threeSum(intArrayOf(-1, 0, 1))

        val expected = listOf(listOf(-1, 0, 1))

        assertEquals(expected.count(), actual.count())
        assertArrayEquals(expected[0].toIntArray(), actual[0].sorted().toIntArray())
    }

    @Test
    fun testThreeSum4() {

        val actual = leetCode15.threeSum(intArrayOf(-100, 90, 10, 2))

        val expected = listOf(listOf(-100, 10, 90))

        assertEquals(expected.count(), actual.count())
        assertArrayEquals(expected[0].toIntArray(), actual[0].sorted().toIntArray())
    }
}