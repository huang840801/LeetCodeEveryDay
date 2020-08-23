package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode56Test {

    private lateinit var leetCode : LeetCode56

    @Before
    fun setUp() {

        leetCode = LeetCode56()
    }

    @Test
    fun test1() {

        val expected = arrayOf(
            intArrayOf(1, 6),
            intArrayOf(8, 10),
            intArrayOf(15, 18)
        )
        val actual = leetCode.merge(
            arrayOf(
                intArrayOf(1, 3),
                intArrayOf(2, 6),
                intArrayOf(8, 10),
                intArrayOf(15, 18)
            )
        )
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {

        val expected = arrayOf(
            intArrayOf(1, 5)
        )
        val actual = leetCode.merge(
            arrayOf(
                intArrayOf(1, 4),
                intArrayOf(4, 5)
            )
        )
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {

        val expected = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(5, 6)
        )
        val actual = leetCode.merge(
            arrayOf(
                intArrayOf(1, 4),
                intArrayOf(5, 6)
            )
        )
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test4() {

        val expected = arrayOf(
            intArrayOf(0, 4)
        )
        val actual = leetCode.merge(
            arrayOf(
                intArrayOf(1, 4),
                intArrayOf(0, 4)
            )
        )
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test5() {

        val expected = arrayOf(
            intArrayOf(1, 4)
        )
        val actual = leetCode.merge(
            arrayOf(
                intArrayOf(1, 4),
                intArrayOf(2, 3)
            )
        )
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test6() {

        val expected = arrayOf(
            intArrayOf(1, 4)
        )
        val actual = leetCode.merge(
            arrayOf(
                intArrayOf(1, 4),
                intArrayOf(1, 4)
            )
        )
        assertArrayEquals(expected, actual)
    }
}