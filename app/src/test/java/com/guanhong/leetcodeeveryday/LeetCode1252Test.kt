package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1252
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1252Test {

    private lateinit var leetCode : LeetCode1252

    @Before
    fun setUp() {

        leetCode = LeetCode1252()
    }

    @Test
    fun testOddCells1() {

        val expected = 6
        val actual = leetCode.oddCells(2, 3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 1)))

        assertEquals(expected, actual)
    }

    @Test
    fun testOddCells2() {

        val expected = 0
        val actual = leetCode.oddCells(
            2, 2,
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(0, 0)
            )
        )

        assertEquals(expected, actual)
    }

    @Test
    fun testOddCells3() {

        val expected = 98
        val actual = leetCode.oddCells(
            50, 50,
            arrayOf(
                intArrayOf(7, 2),
                intArrayOf(7, 6),
                intArrayOf(2, 2)
            )
        )

        assertEquals(expected, actual)
    }
}