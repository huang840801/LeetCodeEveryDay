package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode605
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode605Test {

    private lateinit var leetCode : LeetCode605

    @Before
    fun setUp() {

        leetCode = LeetCode605()
    }

    @Test
    fun testCanPlaceFlowers1() {

        val actual = leetCode.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1)

        assertTrue(actual)
    }

    @Test
    fun testCanPlaceFlowers2() {

        val actual = leetCode.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2)

        assertFalse(actual)
    }

    @Test
    fun testCanPlaceFlowers3() {

        val actual = leetCode.canPlaceFlowers(intArrayOf(1, 0, 1), 1)

        assertFalse(actual)
    }

    @Test
    fun testCanPlaceFlowers4() {

        val actual = leetCode.canPlaceFlowers(intArrayOf(0), 1)

        assertTrue(actual)
    }

    @Test
    fun testCanPlaceFlowers5() {

        val actual = leetCode.canPlaceFlowers(intArrayOf(0), 0)

        assertTrue(actual)
    }

    @Test
    fun testCanPlaceFlowers6() {

        val actual = leetCode.canPlaceFlowers(intArrayOf(1), 1)

        assertFalse(actual)
    }

    @Test
    fun testCanPlaceFlowers7() {

        val actual = leetCode.canPlaceFlowers(intArrayOf(1), 0)

        assertTrue(actual)
    }

    @Test
    fun testCanPlaceFlowers8() {

        val actual = leetCode.canPlaceFlowers(intArrayOf(0, 0, 0), 2)

        assertTrue(actual)
    }
}