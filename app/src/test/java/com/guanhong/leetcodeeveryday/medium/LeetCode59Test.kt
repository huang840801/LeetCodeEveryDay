package com.guanhong.leetcodeeveryday.medium

import org.junit.Assert.assertArrayEquals
import org.junit.Before
import org.junit.Test

class LeetCode59Test {

    private lateinit var leetCode59 : LeetCode59

    @Before
    fun setUp() {

        leetCode59 = LeetCode59()
    }

    @Test
    fun test1() {

        val expected = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(8, 9, 4),
            intArrayOf(7, 6, 5)
        )
        val actual = leetCode59.generateMatrix(3)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {

        val expected = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(12, 13, 14, 5),
            intArrayOf(11, 16, 15, 6),
            intArrayOf(10, 9, 8, 7)
        )
        val actual = leetCode59.generateMatrix(4)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {

        val expected = arrayOf<IntArray>()
        val actual = leetCode59.generateMatrix(0)
        assertArrayEquals(expected, actual)
    }
}