package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1089
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1089Test {

    private lateinit var leetCode : LeetCode1089

    @Before
    fun setUp() {

        leetCode = LeetCode1089()
    }

    @Test
    fun testDuplicateZeros1() {

        val expected = intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)
        val actual = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)

        leetCode.duplicateZeros(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDuplicateZeros2() {

        val expected = intArrayOf(1, 2, 3)
        val actual = intArrayOf(1, 2, 3)

        leetCode.duplicateZeros(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDuplicateZeros3() {

        val expected = intArrayOf(0, 0, 1)
        val actual = intArrayOf(0, 1, 2)

        leetCode.duplicateZeros(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDuplicateZeros4() {

        val expected = intArrayOf(0, 0, 0, 0)
        val actual = intArrayOf(0, 0, 1, 2)

        leetCode.duplicateZeros(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDuplicateZeros5() {

        val expected = intArrayOf(0, 0, 0, 0, 1)
        val actual = intArrayOf(0, 0, 1, 2, 3)

        leetCode.duplicateZeros(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testDuplicateZeros6() {

        val expected = intArrayOf(0, 0, 0, 0, 1, 2)
        val actual = intArrayOf(0, 0, 1, 2, 3, 0)

        leetCode.duplicateZeros(actual)
        assertArrayEquals(expected, actual)
    }
}