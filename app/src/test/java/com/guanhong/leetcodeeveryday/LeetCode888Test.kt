package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode888
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class LeetCode888Test {

    private lateinit var leetCode : LeetCode888

    @Before
    fun setUp() {

        leetCode = LeetCode888()
    }

    @Test
    fun testFairCandySwap1() {

        val actual = leetCode.fairCandySwap(intArrayOf(1, 1), intArrayOf(2, 2))

        assertArrayEquals(intArrayOf(1, 2), actual)
    }

    @Test
    fun testFairCandySwap2() {

        val actual = leetCode.fairCandySwap(intArrayOf(1, 2), intArrayOf(2, 3))

        assertArrayEquals(intArrayOf(1, 2), actual)
    }

    @Test
    fun testFairCandySwap3() {

        val actual = leetCode.fairCandySwap(intArrayOf(2), intArrayOf(1, 3))

        assertArrayEquals(intArrayOf(2, 3), actual)
    }

    @Test
    fun testFairCandySwap4() {

        val actual = leetCode.fairCandySwap(intArrayOf(1, 2, 5), intArrayOf(2, 4))

        assertArrayEquals(intArrayOf(5, 4), actual)
    }

    @Test
    fun testFairCandySwap5() {

        val actual = leetCode.fairCandySwap(intArrayOf(1, 2), intArrayOf(1, 2))

        assertArrayEquals(intArrayOf(1, 1), actual)
    }
}