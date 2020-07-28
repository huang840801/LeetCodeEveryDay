package com.guanhong.leetcodeeveryday.easy

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1496Test {

    private lateinit var leetCode : LeetCode1496

    @Before
    fun setUp() {

        leetCode = LeetCode1496()
    }

    @Test
    fun testIsPathCrossing1() {

        val actual = leetCode.isPathCrossing("NES")
        assertFalse(actual)
    }

    @Test
    fun testIsPathCrossing2() {

        val actual = leetCode.isPathCrossing("NESN")
        assertTrue(actual)
    }
}