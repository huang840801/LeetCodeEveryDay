package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class leetCode1029Test {

    private lateinit var leetCode : LeetCode1029

    @Before
    fun setUp() {

        leetCode = LeetCode1029()
    }

    @Test
    fun testTwoCitySchedCost1() {

        val expected = 110
        val actual = leetCode.twoCitySchedCost(
            arrayOf(
                intArrayOf(10, 20),
                intArrayOf(30, 200),
                intArrayOf(400, 50),
                intArrayOf(30, 20)
            )
        )

        assertEquals(expected, actual)
    }
}