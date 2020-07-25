package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode598
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode598Test {

    private lateinit var leetCode : LeetCode598

    @Before
    fun setUp() {

        leetCode = LeetCode598()
    }

    @Test
    fun testMaxCount1() {

        val actual = leetCode.maxCount(2, 1, arrayOf(intArrayOf(2, 2), intArrayOf(3, 3)))

        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testMaxCount2() {

        val actual = leetCode.maxCount(3, 3, arrayOf(intArrayOf(2, 2), intArrayOf(3, 3)))

        val expected = 4

        assertEquals(expected, actual)
    }
}