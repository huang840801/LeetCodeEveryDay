package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.medium.LeetCode31
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode31Test {

    private lateinit var leetCode : LeetCode31

    @Before
    fun setUp() {

        leetCode = LeetCode31()
    }

    @Test
    fun testNextPermutation1() {

        val expected = intArrayOf(1, 2, 4, 3)

        val array = intArrayOf(1, 2, 3, 4)

        leetCode.nextPermutation(array)

        val actual = array


        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextPermutation2() {

        val expected = intArrayOf(1, 3, 2, 4)

        val array = intArrayOf(1, 2, 4, 3)

        leetCode.nextPermutation(array)

        val actual = array

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextPermutation3() {

        val expected = intArrayOf(1, 2, 3)

        val array = intArrayOf(3, 2, 1)

        leetCode.nextPermutation(array)

        val actual = array

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextPermutation4() {

        val expected = intArrayOf(1, 5, 1)

        val array = intArrayOf(1, 1, 5)

        leetCode.nextPermutation(array)

        val actual = array

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextPermutation5() {

        val expected = intArrayOf(8, 3, 6)

        val array = intArrayOf(6, 8, 3)

        leetCode.nextPermutation(array)

        val actual = array

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextPermutation6() {

        val expected = intArrayOf(1, 2, 3, 8, 3, 6)

        val array = intArrayOf(1, 2, 3, 6, 8, 3)

        leetCode.nextPermutation(array)

        val actual = array

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextPermutation7() {

        val expected = intArrayOf(1, 2, 3, 8, 1, 2, 3, 6)

        val array = intArrayOf(1, 2, 3, 6, 8, 3, 2, 1)

        leetCode.nextPermutation(array)

        val actual = array

        assertArrayEquals(expected, actual)
    }
}