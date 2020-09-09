package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode134Test {

    private lateinit var test : LeetCode134

    @Before
    fun setUp() {

        test = LeetCode134()
    }

    @Test
    fun test1() {

        val expected = 3
        val actual = test.canCompleteCircuit(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(3, 4, 5, 1, 2)
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {

        val expected = -1
        val actual = test.canCompleteCircuit(
            intArrayOf(2, 3, 4),
            intArrayOf(3, 4, 3)
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {

        val expected = 0
        val actual = test.canCompleteCircuit(
            intArrayOf(7),
            intArrayOf(3)
        )
        assertEquals(expected, actual)
    }
}