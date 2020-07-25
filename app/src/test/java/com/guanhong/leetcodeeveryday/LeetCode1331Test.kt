package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1331
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1331Test {

    private lateinit var leetCode : LeetCode1331

    @Before
    fun setUp() {

        leetCode = LeetCode1331()
    }

    @Test
    fun testArrayRankTransform1() {

        val expected = intArrayOf(3, 1, 2, 2)
        val actual = leetCode.arrayRankTransform(intArrayOf(40, 10, 20, 20))

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testArrayRankTransform2() {

        val expected = intArrayOf(1, 1, 1, 1)
        val actual = leetCode.arrayRankTransform(intArrayOf(20, 20, 20, 20))

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testArrayRankTransform3() {

        val expected = intArrayOf(5, 3, 4, 2, 8, 6, 7, 1, 3)
        val actual = leetCode.arrayRankTransform(intArrayOf(37, 12, 28, 9, 100, 56, 80, 5, 12))

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testArrayRankTransform4() {

        val expected = intArrayOf()
        val actual = leetCode.arrayRankTransform(intArrayOf())

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testArrayRankTransform5() {

        val expected = intArrayOf(1)
        val actual = leetCode.arrayRankTransform(intArrayOf(123))

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testArrayRankTransform6() {

        val expected = intArrayOf(6, 5, 9, 7, 10, 4, 2, 1, 8, 11, 3)
        val actual =
            leetCode.arrayRankTransform(intArrayOf(2, -11, 24, 15, 26, -31, -48, -49, 22, 37, -36))

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testArrayRankTransform7() {

        val expected = intArrayOf(4, 5, 3, 2, 1)
        val actual = leetCode.arrayRankTransform(intArrayOf(2, 26, -31, -48, -49))

        assertArrayEquals(expected, actual)
    }
}