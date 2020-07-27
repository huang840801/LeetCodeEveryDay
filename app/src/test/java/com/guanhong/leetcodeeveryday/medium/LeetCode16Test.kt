package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.medium.LeetCode16
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode16Test {

    private lateinit var leetCode16 : LeetCode16

    @Before
    fun setUp() {

        leetCode16 = LeetCode16()
    }

    @Test
    fun testThreeSumClosest1() {

        val actual = leetCode16.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1)
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testThreeSumClosest2() {

        val actual = leetCode16.threeSumClosest(intArrayOf(1, 1, 1, 0), -100)
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testThreeSumClosest3() {

        val actual = leetCode16.threeSumClosest(intArrayOf(1, 1, 1, 50, 50, 50), -100)
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testThreeSumClosest4() {

        val actual = leetCode16.threeSumClosest(intArrayOf(1, 2, 4, 8, 16, 32, 64, 128), 82)
        val expected = 82

        assertEquals(expected, actual)
    }

    @Test
    fun testThreeSumClosest5() {

        val actual = leetCode16.threeSumClosest(intArrayOf(-32, -8, -2, 1, 4, 16, 64, 128), -10)
        val expected = -9

        assertEquals(expected, actual)
    }

    @Test
    fun testTwoNumDistance1() {

        val actual = leetCode16.twoNumDistance(99, 82)
        val expected = 17

        assertEquals(expected, actual)
    }

    @Test
    fun testTwoNumDistance2() {

        val actual = leetCode16.twoNumDistance(82, 99)
        val expected = 17

        assertEquals(expected, actual)
    }

    @Test
    fun testTwoNumDistance3() {

        val actual = leetCode16.twoNumDistance(99, -10)
        val expected = 109

        assertEquals(expected, actual)
    }

    @Test
    fun testTwoNumDistance4() {

        val actual = leetCode16.twoNumDistance(-10, 99)
        val expected = 109

        assertEquals(expected, actual)
    }

    @Test
    fun testTwoNumDistance5() {

        val actual = leetCode16.twoNumDistance(-10, -20)
        val expected = 10

        assertEquals(expected, actual)
    }

    @Test
    fun testTwoNumDistance6() {

        val actual = leetCode16.twoNumDistance(-20, -10)
        val expected = 10

        assertEquals(expected, actual)
    }
}