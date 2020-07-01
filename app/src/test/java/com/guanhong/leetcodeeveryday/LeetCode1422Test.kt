package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1422Test {

    private lateinit var leetCode : LeetCode1422

    @Before
    fun setUp() {

        leetCode = LeetCode1422()
    }

    @Test
    fun testMaxScore1() {

        val expected = 5
        val actual = leetCode.maxScore("011101")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxScore2() {

        val expected = 5
        val actual = leetCode.maxScore("00111")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxScore3() {

        val expected = 3
        val actual = leetCode.maxScore("1111")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxScore4() {

        val expected = 3
        val actual = leetCode.maxScore("0000")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxScore5() {

        val expected = 2
        val actual = leetCode.maxScore("1000")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxScore6() {

        val expected = 4
        val actual = leetCode.maxScore("0001")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxScore7() {

        val expected = 4
        val actual = leetCode.maxScore("0111")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxScore8() {

        val expected = 2
        val actual = leetCode.maxScore("1110")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxScore9() {

        val expected = 2
        val actual = leetCode.maxScore("0100")

        assertEquals(expected, actual)
    }
}