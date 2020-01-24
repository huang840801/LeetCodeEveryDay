package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode167Test {

    private lateinit var leetCode167 : LeetCode167

    @Before
    fun setUp() {

        leetCode167 = LeetCode167()
    }

    @Test
    fun testTwoSum() {

        val actual = leetCode167.twoSum(intArrayOf(2, 7, 11, 15), 13)
        val expected = intArrayOf(1, 3)

        assertArrayEquals(expected, actual)
    }
}