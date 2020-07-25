package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode349
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode349Test {

    private lateinit var leetCode349 : LeetCode349

    @Before
    fun setUp() {

        leetCode349 = LeetCode349()
    }

    @Test
    fun testIntersection1() {

        val actual = leetCode349.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
        val expected = intArrayOf(2)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testIntersection2() {

        val actual = leetCode349.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))
        val expected = intArrayOf(9, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testIntersection3() {

        val actual = leetCode349.intersection(intArrayOf(99), intArrayOf(9, 4, 9, 8, 4))
        val expected = intArrayOf()

        assertArrayEquals(expected, actual)
    }
}