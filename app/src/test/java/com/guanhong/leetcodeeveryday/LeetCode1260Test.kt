package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1260Test {

    private lateinit var leetCode : LeetCode1260

    @Before
    fun setUp() {

        leetCode = LeetCode1260()
    }

    @Test
    fun testShiftGrid1() {

        val expected = arrayOf(listOf(9, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8))
        val actual = leetCode.shiftGrid(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
            ), 1
        ).toTypedArray()
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testShiftGrid2() {

        val expected = arrayOf(
            listOf(12, 0, 21, 13),
            listOf(3, 8, 1, 9),
            listOf(19, 7, 2, 5),
            listOf(4, 6, 11, 10)
        )
        val actual = leetCode.shiftGrid(
            arrayOf(
                intArrayOf(3, 8, 1, 9),
                intArrayOf(19, 7, 2, 5),
                intArrayOf(4, 6, 11, 10),
                intArrayOf(12, 0, 21, 13)
            ), 4
        ).toTypedArray()
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testShiftGrid3() {

        val expected = arrayOf(listOf(8, 9, 1), listOf(2, 3, 4), listOf(5, 6, 7))
        val actual = leetCode.shiftGrid(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
            ), 2
        ).toTypedArray()
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testShiftGrid4() {

        val expected = arrayOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
        val actual = leetCode.shiftGrid(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
            ), 9
        ).toTypedArray()
        assertArrayEquals(expected, actual)
    }
}