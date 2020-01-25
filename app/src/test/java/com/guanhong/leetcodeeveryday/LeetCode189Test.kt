package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode189Test {

    private lateinit var leetCode189 : LeetCode189

    @Before
    fun setUp() {

        leetCode189 = LeetCode189()
    }

    @Test
    fun testRotate1() {

        val actual = leetCode189.rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3)
        val expected = intArrayOf(5, 6, 7, 1, 2, 3, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testRotate2() {

        val actual = leetCode189.rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 2)
        val expected = intArrayOf(6, 7, 1, 2, 3, 4, 5)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testRotate3() {

        val actual = leetCode189.rotate(intArrayOf(1, 2), 3)
        val expected = intArrayOf(2, 1)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testRotate4() {

        val actual = leetCode189.rotate(intArrayOf(1, 2, 3), 5)
        val expected = intArrayOf(2, 3, 1)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testReverse1() {

        val actual = leetCode189.reverse(intArrayOf(1, 2, 3, 4, 5, 6), 0, 2)
        val expected = intArrayOf(3, 2, 1, 4, 5, 6)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testReverse2() {

        val actual = leetCode189.reverse(intArrayOf(1, 2, 3, 4, 5, 6), 0, 5)
        val expected = intArrayOf(6, 5, 4, 3, 2, 1)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testReverse3() {

        val actual = leetCode189.reverse(intArrayOf(1, 2, 3, 4, 5, 6), 1, 5)
        val expected = intArrayOf(1, 6, 5, 4, 3, 2)

        assertArrayEquals(expected, actual)
    }
}