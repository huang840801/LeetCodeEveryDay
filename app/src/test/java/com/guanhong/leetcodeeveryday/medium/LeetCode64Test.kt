package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode64Test {

    private lateinit var leetCode : LeetCode64

    @Before
    fun setUp() {

        leetCode = LeetCode64()
    }

    @Test
    fun test1() {

        val expected = 7
        val actual = leetCode.minPathSum(
            arrayOf(
                intArrayOf(1, 3, 1),
                intArrayOf(1, 5, 1),
                intArrayOf(4, 2, 1)
            )
        )

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {

        val expected = 9
        val actual = leetCode.minPathSum(
            arrayOf(
                intArrayOf(1, 3, 1, 2),
                intArrayOf(1, 5, 1, 2),
                intArrayOf(4, 2, 1, 2)
            )
        )

        assertEquals(expected, actual)
    }
}