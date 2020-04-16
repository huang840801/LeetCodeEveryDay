package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode914Test {

    private lateinit var leetCode : LeetCode914

    @Before
    fun setUp() {

        leetCode = LeetCode914()
    }

    @Test
    fun testHasGroupsSizeX1() {

        val actual = leetCode.hasGroupsSizeX(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1))

        assertTrue(actual)
    }

    @Test
    fun testHasGroupsSizeX2() {

        val actual = leetCode.hasGroupsSizeX(intArrayOf(1, 1, 1, 2, 2, 2, 3, 3))

        assertFalse(actual)
    }

    @Test
    fun testHasGroupsSizeX3() {

        val actual = leetCode.hasGroupsSizeX(intArrayOf(1))

        assertFalse(actual)
    }

    @Test
    fun testHasGroupsSizeX4() {

        val actual = leetCode.hasGroupsSizeX(intArrayOf(1, 1))

        assertTrue(actual)
    }

    @Test
    fun testHasGroupsSizeX5() {

        val actual = leetCode.hasGroupsSizeX(intArrayOf(1, 1, 2, 2, 2, 2))

        assertTrue(actual)
    }

    @Test
    fun testHasGroupsSizeX6() {

        val actual = leetCode.hasGroupsSizeX(intArrayOf(1, 1, 1, 1, 2, 2, 2, 2, 2, 2))

        assertTrue(actual)
    }

    @Test
    fun testHasGroupsSizeX7() {

        val actual = leetCode.hasGroupsSizeX(intArrayOf(1, 1, 1, 2, 2, 2))

        assertTrue(actual)
    }

    @Test
    fun testHasGroupsSizeX8() {

        val actual = leetCode.hasGroupsSizeX(intArrayOf(1, 1))

        assertTrue(actual)
    }
}