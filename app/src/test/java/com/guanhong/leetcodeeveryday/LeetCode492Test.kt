package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode492Test {

    private lateinit var leetCode : LeetCode492

    @Before
    fun setUp() {

        leetCode = LeetCode492()
    }

    @Test
    fun testConstructRectangle1() {

        val actual = leetCode.constructRectangle(24)
        val expected = intArrayOf(6, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testConstructRectangle2() {

        val actual = leetCode.constructRectangle(4)
        val expected = intArrayOf(2, 2)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testConstructRectangle3() {

        val actual = leetCode.constructRectangle(11)
        val expected = intArrayOf(11, 1)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testConstructRectangle4() {

        val actual = leetCode.constructRectangle(1)
        val expected = intArrayOf(1, 1)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testConstructRectangle5() {

        val actual = leetCode.constructRectangle(2)
        val expected = intArrayOf(2, 1)

        assertArrayEquals(expected, actual)
    }
}