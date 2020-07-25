package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode674
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode674Test {

    private lateinit var leetCode : LeetCode674

    @Before
    fun setUp() {

        leetCode = LeetCode674()
    }

    @Test
    fun testFindLengthOfLCIS1() {

        val actual = leetCode.findLengthOfLCIS(intArrayOf(1, 3, 5, 4, 7))
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testFindLengthOfLCIS2() {

        val actual = leetCode.findLengthOfLCIS(intArrayOf(2, 2, 2))
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testFindLengthOfLCIS3() {

        val actual = leetCode.findLengthOfLCIS(intArrayOf(1, 3, 5, 4, 7, 8, 9, 10))
        val expected = 5

        assertEquals(expected, actual)
    }

    @Test
    fun testFindLengthOfLCIS4() {

        val actual = leetCode.findLengthOfLCIS(intArrayOf(10))
        val expected = 1

        assertEquals(expected, actual)
    }
}