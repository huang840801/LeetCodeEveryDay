package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode46Test {

    private lateinit var leetCode : LeetCode46

    @Before
    fun setUp() {

        leetCode = LeetCode46()
    }

    @Test
    fun testPermute1() {

        val expected = listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1)
        )
        val actual = leetCode.permute(intArrayOf(1, 2, 3))

        assertEquals(expected, actual)
    }

    @Test
    fun testPermute2() {

        val expected = listOf(
            listOf(1, 2),
            listOf(2, 1)
        )
        val actual = leetCode.permute(intArrayOf(1, 2))

        assertEquals(expected, actual)
    }

    @Test
    fun testPermute3() {

        val expected = listOf(
            listOf(1, 2, 3, 4),
            listOf(1, 2, 4, 3),
            listOf(1, 3, 2, 4),
            listOf(1, 3, 4, 2),
            listOf(1, 4, 2, 3),
            listOf(1, 4, 3, 2),
            listOf(2, 1, 3, 4),
            listOf(2, 1, 4, 3),
            listOf(2, 3, 1, 4),
            listOf(2, 3, 4, 1),
            listOf(2, 4, 1, 3),
            listOf(2, 4, 3, 1),
            listOf(3, 1, 2, 4),
            listOf(3, 1, 4, 2),
            listOf(3, 2, 1, 4),
            listOf(3, 2, 4, 1),
            listOf(3, 4, 1, 2),
            listOf(3, 4, 2, 1),
            listOf(4, 1, 2, 3),
            listOf(4, 1, 3, 2),
            listOf(4, 2, 1, 3),
            listOf(4, 2, 3, 1),
            listOf(4, 3, 1, 2),
            listOf(4, 3, 2, 1)
        )
        val actual = leetCode.permute(intArrayOf(1, 2, 3, 4))

        assertEquals(expected, actual)
    }
}