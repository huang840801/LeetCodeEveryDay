package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode643
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode643Test {

    private lateinit var leetCode : LeetCode643

    private val delta = 1e-15

    @Before
    fun setUp() {

        leetCode = LeetCode643()
    }

    @Test
    fun testFindMaxAverage1() {

        val actual = leetCode.findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4)
        val expected = 12.75

        assertEquals(expected, actual, delta)
    }

    @Test
    fun testFindMaxAverage2() {

        val actual = leetCode.findMaxAverage(intArrayOf(1, 22, -3), 3)
        val expected = 6.6667

        assertEquals(expected, actual, delta)
    }
}