package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode989Test {

    private lateinit var leetCode : LeetCode989

    @Before
    fun setUp() {

        leetCode = LeetCode989()
    }

    @Test
    fun testAddToArrayForm1() {

        val expected = intArrayOf(1, 2, 3, 4).toTypedArray()
        val actual = leetCode.addToArrayForm(intArrayOf(1, 2, 0, 0), 34).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testAddToArrayForm2() {

        val expected = intArrayOf(1, 0, 2, 1).toTypedArray()
        val actual = leetCode.addToArrayForm(intArrayOf(2, 1, 5), 806).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testAddToArrayForm3() {

        val expected = intArrayOf(4, 5, 5).toTypedArray()
        val actual = leetCode.addToArrayForm(intArrayOf(2, 7, 4), 181).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testAddToArrayForm4() {

        val expected = intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).toTypedArray()
        val actual =
            leetCode.addToArrayForm(intArrayOf(9, 9, 9, 9, 9, 9, 9, 9, 9, 9), 1).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testAddToArrayForm5() {

        val expected = intArrayOf(1, 9, 1).toTypedArray()
        val actual = leetCode.addToArrayForm(intArrayOf(2), 189).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testAddToArrayForm6() {

        val expected = intArrayOf(1, 9, 1).toTypedArray()
        val actual = leetCode.addToArrayForm(intArrayOf(1, 8, 9), 2).toTypedArray()

        assertArrayEquals(expected, actual)
    }
}