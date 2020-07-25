package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1470
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1470Test {

    private lateinit var leetCode : LeetCode1470

    @Before
    fun setUp() {

        leetCode = LeetCode1470()
    }

    @Test
    fun testShuffle1() {

        val expected = intArrayOf(2, 3, 5, 4, 1, 7)
        val actual = leetCode.shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testShuffle2() {

        val expected = intArrayOf(1, 4, 2, 3, 3, 2, 4, 1)
        val actual = leetCode.shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testShuffle3() {

        val expected = intArrayOf(1, 2, 1, 2)
        val actual = leetCode.shuffle(intArrayOf(1, 1, 2, 2), 2)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testShuffle4() {

        val expected = intArrayOf(1, 2)
        val actual = leetCode.shuffle(intArrayOf(1, 2), 1)

        assertArrayEquals(expected, actual)
    }
}