package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1Test {

    private lateinit var leetCode1 : LeetCode1

    @Before
    fun setUp() {

        leetCode1 = LeetCode1()
    }

    @Test
    fun testTwoSum1() {

        val actual = leetCode1.twoSum(intArrayOf(2, 7, 11, 15), 9)
        val expected = intArrayOf(0, 1)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testTwoSum2() {

        val actual = leetCode1.twoSum(intArrayOf(2, 7, 11, 15), 17)
        val expected = intArrayOf(0, 3)

        assertArrayEquals(expected, actual)
    }
}