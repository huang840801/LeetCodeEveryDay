package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode54Test {

    private lateinit var leetCode : LeetCode54

    @Before
    fun setUp() {

        leetCode = LeetCode54()
    }

    @Test
    fun test1() {

        val actual = leetCode.spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
            )
        )

        val expected = listOf(1, 2, 3, 6, 9, 8, 7, 4, 5)

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {

        val actual = leetCode.spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(9, 10, 11, 12)
            )
        )

        val expected = listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)

        assertEquals(expected, actual)
    }

    @Test
    fun test3() {

        val actual = leetCode.spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(9, 10, 11, 12),
                intArrayOf(13, 14, 15, 16)
            )
        )

        val expected = listOf(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10)

        assertEquals(expected, actual)
    }

    @Test
    fun test4() {

        val actual = leetCode.spiralOrder(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(5, 6),
                intArrayOf(9, 10),
                intArrayOf(13, 14)
            )
        )

        val expected = listOf(1, 2, 6, 10, 14, 13, 9, 5)

        assertEquals(expected, actual)
    }

    @Test
    fun test5() {

        val actual = leetCode.spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 13, 14)
            )
        )

        val expected = listOf(1, 2, 13, 14)

        assertEquals(expected, actual)
    }

    @Test
    fun test6() {

        val actual = leetCode.spiralOrder(
            arrayOf(
                intArrayOf()
            )
        )

        val expected = listOf<Int>()

        assertEquals(expected, actual)
    }
}