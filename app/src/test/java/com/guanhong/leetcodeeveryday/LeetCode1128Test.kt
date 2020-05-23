package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1128Test {

    private lateinit var leetCode : LeetCode1128

    @Before
    fun setUp() {

        leetCode = LeetCode1128()
    }

    @Test
    fun testNumEquivDominoPairs1() {

        val expected = 1
        val actual = leetCode.numEquivDominoPairs(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 1),
                intArrayOf(3, 4),
                intArrayOf(5, 6)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testNumEquivDominoPairs2() {

        val expected = 6
        val actual = leetCode.numEquivDominoPairs(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 2),
                intArrayOf(1, 2),
                intArrayOf(1, 2)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testNumEquivDominoPairs3() {

        val expected = 2
        val actual = leetCode.numEquivDominoPairs(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 2),
                intArrayOf(5, 6),
                intArrayOf(6, 5)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testNumEquivDominoPairs4() {

        val expected = 0
        val actual = leetCode.numEquivDominoPairs(
            arrayOf(
                intArrayOf(1, 2)
            )
        )
        assertEquals(expected, actual)
    }

    @Test
    fun testNumEquivDominoPairs5() {

        val expected = 3
        val actual = leetCode.numEquivDominoPairs(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 2),
                intArrayOf(1, 1),
                intArrayOf(1, 2),
                intArrayOf(2, 2)
            )
        )
        assertEquals(expected, actual)
    }
}