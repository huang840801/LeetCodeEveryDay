package com.guanhong.leetcodeeveryday.medium

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class LeetCode40Test {

    private lateinit var leetCode : LeetCode40

    @Before
    fun setUp() {

        leetCode = LeetCode40()
    }

    @Test
    fun combinationSum21() {

        val expected = listOf(
            listOf(1, 1, 6),
            listOf(1, 2, 5),
            listOf(1, 7),
            listOf(2, 6)
        )
        val actual = leetCode.combinationSum2(intArrayOf(10, 1, 2, 7, 6, 1, 5), 8)

        assertEquals(expected, actual)
    }

    @Test
    fun combinationSum22() {

        val expected = listOf(
            listOf(2, 3)
        )
        val actual = leetCode.combinationSum2(intArrayOf(2, 3), 5)

        assertEquals(expected, actual)
    }

    @Test
    fun combinationSum23() {

        val expected = listOf(
            listOf(1, 2, 2),
            listOf(5)
        )
        val actual = leetCode.combinationSum2(intArrayOf(2, 5, 2, 2, 1), 5)

        assertEquals(expected, actual)
    }

    @Test
    fun combinationSum24() {

        val expected = listOf(
            listOf(1)
        )
        val actual = leetCode.combinationSum2(intArrayOf(2, 5, 2, 2, 1), 1)

        assertEquals(expected, actual)
    }

    @Test
    fun combinationSum25() {

        val expected = listOf(listOf<Int>())
        val actual = leetCode.combinationSum2(intArrayOf(2, 5, 2, 2, 1), 0)

        assertEquals(expected, actual)
    }

    @Test
    fun combinationSum26() {

        val expected = listOf<List<Int>>()
        val actual = leetCode.combinationSum2(intArrayOf(1), 2)

        assertEquals(expected, actual)
    }
}