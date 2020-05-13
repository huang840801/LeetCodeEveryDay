package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode38Test {

    private lateinit var leetCode : LeetCode38

    @Before
    fun setUp() {

        leetCode = LeetCode38()
    }

    @Test
    fun testCountAndSay1() {

        val expected = "1"
        val actual = leetCode.countAndSay(1)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountAndSay2() {

        val expected = "11"
        val actual = leetCode.countAndSay(2)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountAndSay3() {

        val expected = "21"
        val actual = leetCode.countAndSay(3)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountAndSay4() {

        val expected = "1211"
        val actual = leetCode.countAndSay(4)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountAndSay5() {

        val expected = "111221"
        val actual = leetCode.countAndSay(5)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountAndSay6() {

        val expected = "312211"
        val actual = leetCode.countAndSay(6)

        assertEquals(expected, actual)
    }
}