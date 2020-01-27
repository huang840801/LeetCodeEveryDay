package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode299Test {

    private lateinit var leetCode299 : LeetCode299

    @Before
    fun setUp() {

        leetCode299 = LeetCode299()
    }

    @Test
    fun testGetHint1() {

        val actual = leetCode299.getHint("1807", "7810")
        val expected = "1A3B"

        assertEquals(expected, actual)
    }

    @Test
    fun testGetHint2() {

        val actual = leetCode299.getHint("1123", "0111")
        val expected = "1A1B"

        assertEquals(expected, actual)
    }

    @Test
    fun testGetHint3() {

        val actual = leetCode299.getHint("1234", "5678")
        val expected = "0A0B"

        assertEquals(expected, actual)
    }

    @Test
    fun testGetHint4() {

        val actual = leetCode299.getHint("1234", "2341")
        val expected = "0A4B"

        assertEquals(expected, actual)
    }

    @Test
    fun testGetHint5() {

        val actual = leetCode299.getHint("1234", "1234")
        val expected = "4A0B"

        assertEquals(expected, actual)
    }
}