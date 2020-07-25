package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.medium.LeetCode34
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode34Test {

    private lateinit var leetCode : LeetCode34

    @Before
    fun setUp() {

        leetCode = LeetCode34()
    }

    @Test
    fun testBinarySearch1() {

        val expected = 2
        val actual = leetCode.binarySearch(intArrayOf(1, 2, 3, 8), 3)

        assertEquals(expected, actual)
    }

    @Test
    fun testBinarySearch2() {

        val expected = 0
        val actual = leetCode.binarySearch(intArrayOf(1, 2, 3, 8), 1)

        assertEquals(expected, actual)
    }

    @Test
    fun testBinarySearch3() {

        val expected = 3
        val actual = leetCode.binarySearch(intArrayOf(1, 2, 3, 8), 8)

        assertEquals(expected, actual)
    }

    @Test
    fun testBinarySearch4() {

        val expected = 3
        val actual = leetCode.binarySearch(intArrayOf(1, 2, 3, 8, 8), 8)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearchRange1() {

        val expected = intArrayOf(3, 4)
        val actual = leetCode.searchRange(intArrayOf(1, 2, 3, 8, 8), 8)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testSearchRange2() {

        val expected = intArrayOf(3, 5)
        val actual = leetCode.searchRange(intArrayOf(1, 2, 3, 8, 8, 8), 8)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testSearchRange3() {

        val expected = intArrayOf(3, 3)
        val actual = leetCode.searchRange(intArrayOf(1, 2, 3, 8), 8)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testSearchRange4() {

        val expected = intArrayOf(-1, -1)
        val actual = leetCode.searchRange(intArrayOf(1, 2, 3, 8), 9)

        assertArrayEquals(expected, actual)
    }
}