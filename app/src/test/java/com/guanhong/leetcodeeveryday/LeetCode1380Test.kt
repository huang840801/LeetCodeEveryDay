package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1380Test {

    private lateinit var leetCode : LeetCode1380

    @Before
    fun setUp() {

        leetCode = LeetCode1380()
    }

    @Test
    fun testLuckyNumbers1() {

        val expected = arrayOf(15)

        val actual = leetCode.luckyNumbers(
            arrayOf(
                intArrayOf(3, 8, 7),
                intArrayOf(9, 11, 13),
                intArrayOf(17, 15, 16)
            )
        )
        assertArrayEquals(expected, actual.toTypedArray())
    }

    @Test
    fun testLuckyNumbers2() {

        val expected = arrayOf(12)

        val actual = leetCode.luckyNumbers(
            arrayOf(
                intArrayOf(1, 10, 4, 2),
                intArrayOf(9, 3, 8, 7),
                intArrayOf(15, 16, 17, 12)
            )
        )
        assertArrayEquals(expected, actual.toTypedArray())
    }

    @Test
    fun testLuckyNumbers3() {

        val expected = arrayOf(7)

        val actual = leetCode.luckyNumbers(
            arrayOf(
                intArrayOf(7, 8),
                intArrayOf(1, 2)
            )
        )
        assertArrayEquals(expected, actual.toTypedArray())
    }
}