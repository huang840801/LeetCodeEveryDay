package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode496
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode496Test {

    private lateinit var leetCode : LeetCode496

    @Before
    fun setUp() {

        leetCode = LeetCode496()
    }

    @Test
    fun testNextGreaterElement1() {

        val actual = leetCode.nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2, 5))
        val expected = intArrayOf(5, 3, 5)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextGreaterElement2() {

        val actual = leetCode.nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2))
        val expected = intArrayOf(-1, 3, -1)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextGreaterElement3() {

        val actual = leetCode.nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2, 5))
        val expected = intArrayOf(5, 3, 5)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextGreaterElement4() {

        val actual = leetCode.nextGreaterElement(intArrayOf(2, 4), intArrayOf(1, 2, 3, 4))
        val expected = intArrayOf(3, -1)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextGreaterElement5() {

        val actual = leetCode.nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 2, 3, 4, 5))
        val expected = intArrayOf(5, 2, 3)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextGreaterElement6() {

        val actual = leetCode.nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 10, 2, 4, 3, 5))
        val expected = intArrayOf(5, 10, 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testNextGreaterElement7() {

        val actual = leetCode.nextGreaterElement(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))
        val expected = intArrayOf(-1, -1, -1)

        assertArrayEquals(expected, actual)
    }
}