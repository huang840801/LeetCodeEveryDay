package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode697Test {

    private lateinit var leetCode : LeetCode697

    @Before
    fun setUp() {

        leetCode = LeetCode697()
    }

    @Test
    fun testFindShortestSubArray1() {

        val actual = leetCode.findShortestSubArray(intArrayOf(1, 2, 2, 3, 1))
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testFindShortestSubArray2() {

        val actual = leetCode.findShortestSubArray(intArrayOf(1, 2, 2, 3, 1, 4, 2))
        val expected = 6

        assertEquals(expected, actual)
    }

    @Test
    fun testFindShortestSubArray3() {

        val actual = leetCode.findShortestSubArray(intArrayOf(1, 2, 2, 3, 1, 4, 2, 7, 2))
        val expected = 8

        assertEquals(expected, actual)
    }

    @Test
    fun testFindShortestSubArray4() {

        val actual = leetCode.findShortestSubArray(
            intArrayOf(
                3,
                3,
                4,
                1,
                2,
                2,
                3,
                5,
                6,
                1,
                6,
                5,
                2,
                3,
                4,
                5
            )
        )
        val expected = 14

        assertEquals(expected, actual)
    }

    @Test
    fun testFindShortestSubArray5() {

        val actual = leetCode.findShortestSubArray(intArrayOf(3, 3))
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testFindShortestSubArray6() {

        val actual = leetCode.findShortestSubArray(intArrayOf(3))
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testFindShortestSubArray7() {

        val actual = leetCode.findShortestSubArray(intArrayOf())
        val expected = 0

        assertEquals(expected, actual)
    }
}