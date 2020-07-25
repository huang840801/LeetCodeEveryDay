package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode463
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode463Test {

    private lateinit var leetCode : LeetCode463

    @Before
    fun setUp() {

        leetCode = LeetCode463()
    }

    @Test
    fun testIslandPerimeter1() {

        val actual = leetCode.islandPerimeter(arrayOf(intArrayOf(0, 1, 1, 0)))
        val expected = 6

        assertEquals(expected, actual)
    }

    @Test
    fun testIslandPerimeter2() {

        val actual = leetCode.islandPerimeter(arrayOf(intArrayOf(1, 1, 1, 0)))
        val expected = 8

        assertEquals(expected, actual)
    }

    @Test
    fun testIslandPerimeter3() {

        val actual = leetCode.islandPerimeter(
            arrayOf(
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 1, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 0, 0)
            )
        )
        val expected = 16

        assertEquals(expected, actual)
    }

    @Test
    fun testIslandPerimeter4() {

        val actual = leetCode.islandPerimeter(
            arrayOf(
                intArrayOf(0, 1, 0, 0),
                intArrayOf(0, 1, 1, 0),
                intArrayOf(1, 1, 0, 0),
                intArrayOf(1, 1, 0, 0)
            )
        )
        val expected = 12

        assertEquals(expected, actual)
    }

    @Test
    fun testIslandPerimeter5() {

        val actual = leetCode.islandPerimeter(
            arrayOf(
                intArrayOf(0, 1, 0, 1),
                intArrayOf(1, 1, 1, 1),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 0, 0)
            )
        )
        val expected = 20

        assertEquals(expected, actual)
    }
}