package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1475
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1475Test {

    private lateinit var leetCode : LeetCode1475

    @Before
    fun setUp() {

        leetCode = LeetCode1475()
    }

    @Test
    fun testFinalPrices1() {

        val expected = intArrayOf(4, 2, 4, 2, 3)
        val actual = leetCode.finalPrices(intArrayOf(8, 4, 6, 2, 3))

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testFinalPrices2() {

        val expected = intArrayOf(1, 2, 3, 4, 5)
        val actual = leetCode.finalPrices(intArrayOf(1, 2, 3, 4, 5))

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testFinalPrices3() {

        val expected = intArrayOf(9, 0, 1, 6)
        val actual = leetCode.finalPrices(intArrayOf(10, 1, 1, 6))

        assertArrayEquals(expected, actual)
    }
}