package com.guanhong.leetcodeeveryday.easy

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1502Test {

    private lateinit var leetCode : LeetCode1502

    @Before
    fun setUp() {

        leetCode = LeetCode1502()
    }

    @Test
    fun testCanMakeArithmeticProgression1() {

        val actual = leetCode.canMakeArithmeticProgression(intArrayOf(1, 3, 5))
        assertTrue(actual)
    }

    @Test
    fun testCanMakeArithmeticProgression2() {

        val actual = leetCode.canMakeArithmeticProgression(intArrayOf(1, 2, 4))
        assertFalse(actual)
    }

    @Test
    fun testCanMakeArithmeticProgression3() {

        val actual = leetCode.canMakeArithmeticProgression(intArrayOf(-3, 5, 1))
        assertTrue(actual)
    }

    @Test
    fun testCanMakeArithmeticProgression4() {

        val actual = leetCode.canMakeArithmeticProgression(intArrayOf(1, 1, 1))
        assertTrue(actual)
    }
}