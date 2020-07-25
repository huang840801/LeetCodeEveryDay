package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode475
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode475Test {

    private lateinit var leetCode : LeetCode475

    @Before
    fun setUp() {

        leetCode = LeetCode475()
    }

    @Test
    fun testFindRadius1() {

        val actual = leetCode.findRadius(intArrayOf(1, 2, 3), intArrayOf(2))
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testFindRadius2() {

        val actual = leetCode.findRadius(intArrayOf(1, 2, 3, 4), intArrayOf(1, 4))
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testFindRadius3() {

        val actual = leetCode.findRadius(intArrayOf(1, 2, 3, 6, 8), intArrayOf(2, 5, 7))
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testFindRadius4() {

        val actual = leetCode.findRadius(intArrayOf(1, 2, 3, 6, 8), intArrayOf(1))
        val expected = 7

        assertEquals(expected, actual)
    }

    @Test
    fun testFindRadius5() {

        val actual = leetCode.findRadius(intArrayOf(1, 5), intArrayOf(2))
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testFindRadius6() {

        val actual = leetCode.findRadius(intArrayOf(1, 8), intArrayOf(1, 10))
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testFindRadius7() {

        val actual = leetCode.findRadius(intArrayOf(5, 8), intArrayOf(1, 10))
        val expected = 4

        assertEquals(expected, actual)
    }
}