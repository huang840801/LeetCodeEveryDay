package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode120Test {

    private lateinit var leetCode : LeetCode120

    @Before
    fun setUp() {

        leetCode = LeetCode120()
    }

    @Test
    fun test1() {

        val expected = 14
        val actual = leetCode.minimumTotal(
            listOf(
                listOf(2),
                listOf(3, 4),
                listOf(6, 15, 7),
                listOf(4, 3, 8, 1)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {

        val expected = 11
        val actual = leetCode.minimumTotal(
            listOf(
                listOf(2),
                listOf(3, 4),
                listOf(6, 5, 7),
                listOf(4, 1, 8, 3)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {

        val expected = 7
        val actual = leetCode.minimumTotal(
            listOf(
                listOf(2),
                listOf(3, 3),
                listOf(1, 15, 7),
                listOf(1, 3, 8, 10)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {

        val expected = 7
        val actual = leetCode.minimumTotal(
            listOf(
                listOf(2),
                listOf(3, 3),
                listOf(7, 15, 1),
                listOf(10, 3, 8, 1)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {

        val expected = -1
        val actual = leetCode.minimumTotal(
            listOf(
                listOf(-1),
                listOf(2, 3),
                listOf(1, -1, -3)
            )
        )
        assertEquals(expected, actual)
    }
}