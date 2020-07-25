package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode704
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode704Test {

    private lateinit var leetCode : LeetCode704

    @Before
    fun setUp() {

        leetCode = LeetCode704()
    }

    @Test
    fun testSearch1() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9)
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch2() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 0)
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch3() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 12)
        val expected = 5

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch4() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9, 12), -1)
        val expected = 0

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch5() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9), -1)
        val expected = 0

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch6() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9), 0)
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch7() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9), 9)
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch8() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9), 5)
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch9() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9), 6)
        val expected = -1

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch10() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5), 2)
        val expected = -1

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch11() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2)
        val expected = -1

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch12() {

        val actual = leetCode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 4)
        val expected = -1

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch13() {

        val actual = leetCode.search(intArrayOf(-1, 0), 4)
        val expected = -1

        assertEquals(expected, actual)
    }

    @Test
    fun testSearch14() {

        val actual = leetCode.search(intArrayOf(-1, 0, 2), 0)
        val expected = 1

        assertEquals(expected, actual)
    }
}