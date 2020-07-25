package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1018
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1018Test {

    private lateinit var leetCode : LeetCode1018

    @Before
    fun setUp() {

        leetCode = LeetCode1018()
    }

    @Test
    fun testPrefixesDivBy51() {

        val actual = leetCode.prefixesDivBy5(intArrayOf(0, 1, 1))

        val expected = booleanArrayOf(true, false, false)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testPrefixesDivBy52() {

        val actual = leetCode.prefixesDivBy5(intArrayOf(1, 1, 1))

        val expected = booleanArrayOf(false, false, false)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testPrefixesDivBy53() {

        val actual = leetCode.prefixesDivBy5(intArrayOf(0, 1, 1, 1, 1, 1))

        val expected = booleanArrayOf(true, false, false, false, true, false)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testPrefixesDivBy54() {

        val actual = leetCode.prefixesDivBy5(intArrayOf(1, 1, 1, 0, 1))

        val expected = booleanArrayOf(false, false, false, false, false)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testPrefixesDivBy55() {

        val actual = leetCode.prefixesDivBy5(intArrayOf(0, 0, 0))

        val expected = booleanArrayOf(true, true, true)
        assertArrayEquals(expected, actual)
    }
}