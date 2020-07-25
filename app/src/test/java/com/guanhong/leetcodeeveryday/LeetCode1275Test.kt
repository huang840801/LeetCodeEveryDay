package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1275
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1275Test {

    private lateinit var leetCode : LeetCode1275

    @Before
    fun setUp() {

        leetCode = LeetCode1275()
    }

    @Test
    fun testTictactoe1() {

        val actual = "A"
        val expected = leetCode.tictactoe(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(2, 0),
                intArrayOf(1, 1),
                intArrayOf(2, 1),
                intArrayOf(2, 2)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testTictactoe2() {

        val actual = "B"
        val expected = leetCode.tictactoe(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(1, 1),
                intArrayOf(0, 1),
                intArrayOf(0, 2),
                intArrayOf(1, 0),
                intArrayOf(2, 0)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testTictactoe3() {

        val actual = "Draw"
        val expected = leetCode.tictactoe(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(1, 1),
                intArrayOf(2, 0),
                intArrayOf(1, 0),
                intArrayOf(1, 2),
                intArrayOf(2, 1),
                intArrayOf(0, 1),
                intArrayOf(0, 2),
                intArrayOf(2, 2)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testTictactoe4() {

        val actual = "Pending"
        val expected = leetCode.tictactoe(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(1, 1)
            )
        )
        assertEquals(expected, actual)
    }
}