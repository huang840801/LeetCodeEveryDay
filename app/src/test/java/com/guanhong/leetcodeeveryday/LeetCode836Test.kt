package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode836Test {

    private lateinit var leetCode : LeetCode836

    @Before
    fun setUp() {

        leetCode = LeetCode836()
    }

    @Test
    fun testIsRectangleOverlap1() {

        val actual = leetCode.isRectangleOverlap(intArrayOf(0, 0, 1, 1), intArrayOf(1, 0, 2, 1))

        assertFalse(actual)
    }

    @Test
    fun testIsRectangleOverlap2() {

        val actual = leetCode.isRectangleOverlap(intArrayOf(0, 0, 2, 2), intArrayOf(1, 1, 3, 3))

        assertTrue(actual)
    }

    @Test
    fun testIsRectangleOverlap3() {

        val actual = leetCode.isRectangleOverlap(intArrayOf(0, 0, 1, 1), intArrayOf(1, 1, 2, 2))

        assertFalse(actual)
    }
}