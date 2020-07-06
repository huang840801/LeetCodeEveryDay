package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1441Test {

    private lateinit var leetCode : LeetCode1441

    @Before
    fun setUp() {

        leetCode = LeetCode1441()
    }

    @Test
    fun testBuildArray1() {

        val expected = listOf("Push", "Push", "Pop", "Push")
        val actual = leetCode.buildArray(intArrayOf(1, 3), 3)

        assertEquals(expected, actual)
    }

    @Test
    fun testBuildArray2() {

        val expected = listOf("Push", "Push", "Push")
        val actual = leetCode.buildArray(intArrayOf(1, 2, 3), 3)

        assertEquals(expected, actual)
    }

    @Test
    fun testBuildArray3() {

        val expected = listOf("Push", "Push")
        val actual = leetCode.buildArray(intArrayOf(1, 2), 4)

        assertEquals(expected, actual)
    }

    @Test
    fun testBuildArray4() {

        val expected = listOf("Push", "Pop", "Push", "Push", "Push")
        val actual = leetCode.buildArray(intArrayOf(2, 3, 4), 4)

        assertEquals(expected, actual)
    }

    @Test
    fun testBuildArray5() {

        val expected = listOf("Push", "Push", "Pop", "Push", "Pop", "Push", "Pop", "Push")
        val actual = leetCode.buildArray(intArrayOf(1, 5), 5)

        assertEquals(expected, actual)
    }

    @Test
    fun testBuildArray6() {

        val expected = listOf("Push", "Pop", "Push", "Push", "Pop", "Push", "Pop", "Push")
        val actual = leetCode.buildArray(intArrayOf(2, 5), 5)

        assertEquals(expected, actual)
    }
}