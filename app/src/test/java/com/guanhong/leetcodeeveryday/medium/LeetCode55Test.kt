package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode55Test {

    private lateinit var leetCode : LeetCode55

    @Before
    fun setUp() {

        leetCode = LeetCode55()
    }

    @Test
    fun test1() {

        val actual = leetCode.canJump(intArrayOf(2, 3, 1, 1, 4))

        assertTrue(actual)
    }

    @Test
    fun test2() {

        val actual = leetCode.canJump(intArrayOf(3, 2, 1, 0, 4))

        assertFalse(actual)
    }

    @Test
    fun test3() {

        val actual = leetCode.canJump(intArrayOf(0, 0))

        assertFalse(actual)
    }

    @Test
    fun test4() {

        val actual = leetCode.canJump(intArrayOf(0))

        assertTrue(actual)
    }
}