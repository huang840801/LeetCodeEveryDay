package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1232
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1232Test {

    private lateinit var leetCode : LeetCode1232

    @Before
    fun setUp() {

        leetCode = LeetCode1232()
    }

    @Test
    fun testCheckStraightLine1() {

        val expected = true
        val actual = leetCode.checkStraightLine(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 5)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testCheckStraightLine2() {

        val expected = false
        val actual = leetCode.checkStraightLine(
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(2, 2),
                intArrayOf(3, 4),
                intArrayOf(4, 5),
                intArrayOf(5, 6),
                intArrayOf(7, 7)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testCheckStraightLine3() {

        val expected = true
        val actual = leetCode.checkStraightLine(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 1),
                intArrayOf(0, -1)
            )
        )
        assertEquals(expected, actual)
    }
}