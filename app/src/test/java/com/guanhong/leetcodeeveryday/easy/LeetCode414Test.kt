package com.guanhong.leetcodeeveryday.easy

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode414Test {

    private lateinit var leetCode : LeetCode414

    @Before
    fun setUp() {

        leetCode = LeetCode414()
    }

    @Test
    fun testThirdMax() {

        val actual = leetCode.thirdMax(intArrayOf())
        val expected = 0

        assertEquals(expected, actual)
    }

    @Test
    fun testRecursiveThirdMax() {

        val actual = leetCode.recursiveThirdMax(intArrayOf(4, 5, 7, 2, 1), 0)
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testRemoveDuplicateElement() {

        val actual = leetCode.removeDuplicateElement(intArrayOf(2, 9, 6))
        val expected = intArrayOf(2, 9, 6)

        assertArrayEquals(expected, actual)
    }
}