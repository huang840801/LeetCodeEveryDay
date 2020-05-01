package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode997Test {

    private lateinit var leetCode : LeetCode997

    @Before
    fun setUp() {

        leetCode = LeetCode997()
    }

    @Test
    fun testFindJudge1() {

        val expected = 2
        val actual = leetCode.findJudge(2, arrayOf(intArrayOf(1, 2)))

        assertEquals(expected, actual)
    }

    @Test
    fun testFindJudge2() {

        val expected = 3
        val actual = leetCode.findJudge(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3)))

        assertEquals(expected, actual)
    }

    @Test
    fun testFindJudge3() {

        val expected = -1
        val actual =
            leetCode.findJudge(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(3, 1)))

        assertEquals(expected, actual)
    }

    @Test
    fun testFindJudge4() {

        val expected = -1
        val actual = leetCode.findJudge(3, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)))

        assertEquals(expected, actual)
    }

    @Test
    fun testFindJudge5() {

        val expected = 3
        val actual = leetCode.findJudge(
            4,
            arrayOf(
                intArrayOf(1, 3),
                intArrayOf(1, 4),
                intArrayOf(2, 3),
                intArrayOf(2, 4),
                intArrayOf(4, 3)
            )
        )

        assertEquals(expected, actual)
    }
}