package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode985Test {

    private lateinit var dateSelection : LeetCode985

    @Before
    fun setUp() {

        dateSelection = LeetCode985()
    }

    @Test
    fun testSumEvenAfterQueries() {

        val actual = dateSelection.sumEvenAfterQueries(
            intArrayOf(1, 2, 3, 4),
            arrayOf(
                intArrayOf(1, 0), intArrayOf(-3, 1), intArrayOf(-4, 0), intArrayOf(2, 3)
            )
        )
        val expected = intArrayOf(8, 6, 2, 4)

        assertArrayEquals(expected, actual)
    }
}