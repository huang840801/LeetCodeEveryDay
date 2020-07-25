package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1446
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1446Test {

    private lateinit var leetCode : LeetCode1446

    @Before
    fun setUp() {

        leetCode = LeetCode1446()
    }

    @Test
    fun testMaxPower1() {

        val expected = 2
        val actual = leetCode.maxPower("leetcode")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxPower2() {

        val expected = 5
        val actual = leetCode.maxPower("abbcccddddeeeeedcba")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxPower3() {

        val expected = 5
        val actual = leetCode.maxPower("triplepillooooow")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxPower4() {

        val expected = 11
        val actual = leetCode.maxPower("hooraaaaaaaaaaay")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxPower5() {

        val expected = 1
        val actual = leetCode.maxPower("tourist")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxPower6() {

        val expected = 2
        val actual = leetCode.maxPower("ttourist")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxPower7() {

        val expected = 2
        val actual = leetCode.maxPower("touristt")

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxPower8() {

        val expected = 1
        val actual = leetCode.maxPower("r")

        assertEquals(expected, actual)
    }
}