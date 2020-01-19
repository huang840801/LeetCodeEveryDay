package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1137Test {

    private lateinit var leetCode1137 : LeetCode1137

    @Before
    fun setUp() {

        leetCode1137 = LeetCode1137()
    }

    @Test
    fun testTribonacci() {

        val actual = leetCode1137.tribonacci(3)
        val expected = 2

        assertEquals(expected, actual)
    }
}