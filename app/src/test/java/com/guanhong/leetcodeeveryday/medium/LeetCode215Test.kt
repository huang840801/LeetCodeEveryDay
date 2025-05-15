package com.guanhong.leetcodeeveryday.medium

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LeetCode215Test {

    private lateinit var leetCode215 : LeetCode215

    @Before
    fun setUp() {
        leetCode215 = LeetCode215()
    }

    @Test
    fun test1() {
        val expected = 4
        val actual = leetCode215.findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 3)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val expected = 5
        val actual = leetCode215.findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6, 6), 4)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val expected = 1
        val actual = leetCode215.findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 6)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val expected = 3
        val actual = leetCode215.findKthLargest(intArrayOf(3), 1)
        Assert.assertEquals(expected, actual)
    }
}