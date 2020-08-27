package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode63Test {

    private lateinit var leetCode : LeetCode63

    @Before
    fun setUp() {

        leetCode = LeetCode63()
    }

    @Test
    fun test1() {

        val expected = 2
        val actual = leetCode.uniquePathsWithObstacles(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {

        val expected = 4
        val actual = leetCode.uniquePathsWithObstacles(
            arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(0, 0, 0, 0)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {

        val expected = 0
        val actual = leetCode.uniquePathsWithObstacles(
            arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(0, 0, 0, 1)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {

        val expected = 0
        val actual = leetCode.uniquePathsWithObstacles(
            arrayOf(
                intArrayOf(0, 1, 0, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(0, 1, 0, 0)
            )
        )
        assertEquals(expected, actual)
    }
}