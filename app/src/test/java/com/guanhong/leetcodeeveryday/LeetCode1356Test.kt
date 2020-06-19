package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1356Test {

    private lateinit var leetCode : LeetCode1356

    @Before
    fun setUp() {

        leetCode = LeetCode1356()
    }

    @Test
    fun testGetBitCount1() {

        val expected = 1
        val actual = leetCode.getBitCount(2)

        assertEquals(expected, actual)
    }

    @Test
    fun testGetBitCount2() {

        val expected = 1
        val actual = leetCode.getBitCount(4)

        assertEquals(expected, actual)
    }

    @Test
    fun testGetBitCount3() {

        val expected = 1
        val actual = leetCode.getBitCount(8)

        assertEquals(expected, actual)
    }

    @Test
    fun testGetBitCount4() {

        val expected = 3
        val actual = leetCode.getBitCount(7)

        assertEquals(expected, actual)
    }

    @Test
    fun testGetBitCount5() {

        val expected = 2
        val actual = leetCode.getBitCount(3)

        assertEquals(expected, actual)
    }

    @Test
    fun testSortByBits1() {

        val expected = intArrayOf(0, 1, 2, 4, 8, 3, 5, 6, 7)
        val actual = leetCode.sortByBits(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8))

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testSortByBits2() {

        val expected = intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024)
        val actual = leetCode.sortByBits(intArrayOf(1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1))

        assertArrayEquals(expected, actual)
    }
}