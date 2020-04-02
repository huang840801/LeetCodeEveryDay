package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode830Test {

    private lateinit var leetCode : LeetCode830

    @Before
    fun setUp() {

        leetCode = LeetCode830()
    }

    @Test
    fun testLargeGroupPositions1() {

        val actual = leetCode.largeGroupPositions("abbxxxxzzy").toTypedArray()
        val expected = listOf(listOf(3, 6)).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testLargeGroupPositions2() {

        val actual = leetCode.largeGroupPositions("abc").toTypedArray()
        val expected = listOf<List<Int>>().toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testLargeGroupPositions3() {

        val actual = leetCode.largeGroupPositions("abcdddeeeeaabbbcd").toTypedArray()
        val expected = listOf(listOf(3, 5), listOf(6, 9), listOf(12, 14)).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testLargeGroupPositions4() {

        val actual = leetCode.largeGroupPositions("adddbbb").toTypedArray()
        val expected = listOf(listOf(1, 3), listOf(4, 6)).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testLargeGroupPositions5() {

        val actual = leetCode.largeGroupPositions("aaa").toTypedArray()
        val expected = listOf(listOf(0, 2)).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testLargeGroupPositions6() {

        val actual = leetCode.largeGroupPositions("").toTypedArray()
        val expected = listOf<List<Int>>().toTypedArray()

        assertArrayEquals(expected, actual)
    }
}