package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode33Test {

    private lateinit var leetCode : LeetCode33

    @Before
    fun setUp() {

        leetCode = LeetCode33()
    }

    @Test
    fun testSearch1() {

        val expected = 4
        val actual = leetCode.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch2() {

        val expected = -1
        val actual = leetCode.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch3() {

        val expected = 5
        val actual = leetCode.search(intArrayOf(2, 4, 5, 6, 7, 0, 1), 0)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch4() {

        val expected = -1
        val actual = leetCode.search(intArrayOf(0, 1, 2, 4, 5, 6, 7), 3)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch5() {

        val expected = 5
        val actual = leetCode.search(intArrayOf(0, 1, 2, 4, 5, 6, 7), 6)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch6() {

        val expected = -1
        val actual = leetCode.search(intArrayOf(1, 3), 4)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch7() {

        val expected = -1
        val actual = leetCode.search(intArrayOf(2, 5), 1)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch8() {

        val expected = 0
        val actual = leetCode.search(intArrayOf(1, 2, 3, 4, 5, 6), 1)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch9() {

        val expected = 5
        val actual = leetCode.search(intArrayOf(1, 2, 3, 4, 5, 6), 6)

        assertEquals(expected, actual)
    }
}