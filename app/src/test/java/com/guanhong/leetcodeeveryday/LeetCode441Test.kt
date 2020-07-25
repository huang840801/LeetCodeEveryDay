package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode441
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode441Test {

    private lateinit var leetCode : LeetCode441

    @Before
    fun setUp() {

        leetCode = LeetCode441()
    }

    @Test
    fun testArrangeCoins1() {

        val aa = 20
        val bb = 8

        println(" hhh " + (3.toFloat() * aa / bb))

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