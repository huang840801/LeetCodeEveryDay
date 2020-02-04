package com.guanhong.leetcodeeveryday

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class LeetCode119Test {

    private lateinit var leetCode119 : LeetCode119

    @Before
    fun setUp() {

        leetCode119 = LeetCode119()
    }

    @Test
    fun getRow1() {

        val actual = leetCode119.getRow(3)
        val expected = listOf(1, 3, 3, 1)

        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }

    @Test
    fun getRow2() {

        val actual = leetCode119.getRow(0)
        val expected = listOf(1)

        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }

    @Test
    fun getRow3() {

        val actual = leetCode119.getRow(5)
        val expected = listOf(1, 5, 10, 10, 5, 1)

        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }
}