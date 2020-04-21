package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode941Test {

    private lateinit var leetCode : LeetCode941

    @Before
    fun setUp() {

        leetCode = LeetCode941()
    }

    @Test
    fun testValidMountainArray1() {

        val actual = leetCode.validMountainArray(intArrayOf(3, 5, 5))

        assertFalse(actual)
    }

    @Test
    fun testValidMountainArray2() {

        val actual = leetCode.validMountainArray(intArrayOf(0, 3, 2, 1))

        assertTrue(actual)
    }

    @Test
    fun testValidMountainArray3() {

        val actual = leetCode.validMountainArray(intArrayOf(3, 5, 6))

        assertFalse(actual)
    }

    @Test
    fun testValidMountainArray4() {

        val actual = leetCode.validMountainArray(intArrayOf(0, 2, 3, 5, 2, 1))

        assertTrue(actual)
    }

    @Test
    fun testValidMountainArray5() {

        val actual = leetCode.validMountainArray(intArrayOf(0, 2, 3, 3, 5, 2, 1))

        assertFalse(actual)
    }

    @Test
    fun testValidMountainArray6() {

        val actual = leetCode.validMountainArray(intArrayOf(1, 3, 2))

        assertTrue(actual)
    }

    @Test
    fun testValidMountainArray7() {

        val actual = leetCode.validMountainArray(intArrayOf(8, 7, 6))

        assertFalse(actual)
    }
}