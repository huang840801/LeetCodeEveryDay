package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode832
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode832Test {

    private lateinit var leetCode : LeetCode832

    @Before
    fun setUp() {

        leetCode = LeetCode832()
    }

    @Test
    fun testFlipAndInvertImage1() {

        val actual = leetCode.flipAndInvertImage(
            arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0)
            )
        )

        val expected = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1)
        )

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testFlipAndInvertImage2() {

        val actual = leetCode.flipAndInvertImage(
            arrayOf(
                intArrayOf(1, 1, 0, 0),
                intArrayOf(1, 0, 0, 1),
                intArrayOf(0, 1, 1, 1),
                intArrayOf(1, 0, 1, 0)
            )
        )

        val expected = arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 0, 1),
            intArrayOf(1, 0, 1, 0)
        )

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testFlipAndInvertImage3() {

        val actual = leetCode.flipAndInvertImage(arrayOf())

        val expected = arrayOf<IntArray>()

        assertArrayEquals(expected, actual)
    }
}