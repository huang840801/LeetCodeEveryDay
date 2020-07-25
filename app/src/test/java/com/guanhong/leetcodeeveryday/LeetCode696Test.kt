package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode696
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode696Test {

    private lateinit var leetCode : LeetCode696

    @Before
    fun setUp() {

        leetCode = LeetCode696()
    }

    @Test
    fun testCountBinarySubstrings1() {

        val actual = leetCode.countBinarySubstrings("00110011")
        val expected = 6

        assertEquals(expected, actual)
    }

    @Test
    fun testCountBinarySubstrings2() {

        val actual = leetCode.countBinarySubstrings("10101")
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testCountBinarySubstrings3() {

        val actual = leetCode.countBinarySubstrings("0011")
        val expected = 2

        assertEquals(expected, actual)
    }
}