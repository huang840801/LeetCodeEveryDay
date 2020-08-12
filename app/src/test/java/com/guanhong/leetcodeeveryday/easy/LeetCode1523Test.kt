package com.guanhong.leetcodeeveryday.easy

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1523Test {

    private lateinit var leetCode : LeetCode1523

    @Before
    fun setUp() {

        leetCode = LeetCode1523()
    }

    @Test
    fun testCountOdds1() {

        val expected = 3
        val actual = leetCode.countOdds(3, 7)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountOdds2() {

        val expected = 1
        val actual = leetCode.countOdds(8, 10)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountOdds3() {

        val expected = 4
        val actual = leetCode.countOdds(3, 10)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountOdds4() {

        val expected = 2
        val actual = leetCode.countOdds(8, 11)

        assertEquals(expected, actual)
    }
}