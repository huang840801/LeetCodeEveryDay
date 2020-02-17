package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import kotlin.system.measureTimeMillis

class LeetCode441Test {

    private lateinit var leetCode : LeetCode441

    @Before
    fun setUp() {

        leetCode = LeetCode441()
    }

    @Test
    fun testArrangeCoins1() {

        val actual = leetCode.arrangeCoins(6)
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testArrangeCoins2() {

        val actual = leetCode.arrangeCoins(2147483647)
        val expected = 65535

        assertEquals(expected, actual)
    }

    @Test
    fun testArrangeCoins3() {

        val actual = leetCode.arrangeCoins(65675765)
        val expected = 11460

        assertEquals(expected, actual)
    }

    @Test
    fun testArrangeCoins4() {

        val actual = leetCode.arrangeCoins(60)
        val expected = 10

        assertEquals(expected, actual)
    }
}