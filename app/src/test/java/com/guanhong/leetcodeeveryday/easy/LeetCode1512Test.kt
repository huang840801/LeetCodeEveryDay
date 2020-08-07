package com.guanhong.leetcodeeveryday.easy

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1512Test {

    private lateinit var leetCode : LeetCode1512

    @Before
    fun setUp() {

        leetCode = LeetCode1512()
    }

    @Test
    fun testNumIdenticalPairs1() {

        val expected = 4
        val actual = leetCode.numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3))

        assertEquals(expected, actual)
    }

    @Test
    fun testNumIdenticalPairs2() {

        val expected = 6
        val actual = leetCode.numIdenticalPairs(intArrayOf(1, 1, 1, 1))

        assertEquals(expected, actual)
    }

    @Test
    fun testNumIdenticalPairs3() {

        val expected = 10
        val actual = leetCode.numIdenticalPairs(intArrayOf(1, 1, 1, 1, 1))

        assertEquals(expected, actual)
    }

    @Test
    fun testNumIdenticalPairs4() {

        val expected = 0
        val actual = leetCode.numIdenticalPairs(intArrayOf(1, 2, 3))

        assertEquals(expected, actual)
    }
}