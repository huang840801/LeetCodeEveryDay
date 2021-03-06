package com.guanhong.leetcodeeveryday

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class LeetCodeTest {

    private lateinit var leetCode: LeetCode

    @Before
    fun setUp() {

        leetCode = LeetCode()
    }

    /**
     * test result
     */

    @Test
    fun test() {

//        val expected = 4
//        val actual = leetCode.test()
//
//        assertEquals(expected, actual)
    }

    /**
     * 728
     */
    @Test
    fun testSelfDividingNumbers() {

        val actual = leetCode.selfDividingNumbers(1, 1)
        val expected = listOf(1)

        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }

    /**
     * 977
     */
    @Test
    fun testSortedSquares() {

        val actual = leetCode.sortedSquares(intArrayOf(-5))
        val expected = intArrayOf(25)

        assertArrayEquals(expected, actual)
    }

    /**
     * 867
     */
    @Test
    fun testTranspose() {

        val actual = leetCode.transpose(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)))
        val expected = arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 6))

        assertArrayEquals(expected, actual)
    }

    /**
     * 970
     */
    @Test
    fun testPowerNumber() {

        val actual = leetCode.powerNumberMaxUnderBigNumber(27, 3, 0)
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testIsPower() {

        val actual = leetCode.isPower(5, 1)
        val expected = false

        assertEquals(expected, actual)
    }

    @Test
    fun testPower() {

        val actual = leetCode.power(4, 4)
        val expected = 256

        assertEquals(expected, actual)
    }

    @Test
    fun testPowerfulIntegers1() {

        val actual = leetCode.powerfulIntegers(2, 3, 10).toIntArray()
        val expected = intArrayOf(2, 3, 4, 5, 7, 9, 10)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testPowerfulIntegers2() {

        val actual = leetCode.powerfulIntegers(1, 1, 1).toIntArray()
        val expected = intArrayOf()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testPowerfulIntegers3() {

        val actual = leetCode.powerfulIntegers(1, 1, 2).toIntArray()
        val expected = intArrayOf(2)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testPowerfulIntegers4() {

        val actual = leetCode.powerfulIntegers(3, 5, 15).toIntArray()
        val expected = intArrayOf(2, 4, 6, 8, 10, 14)

        assertArrayEquals(expected, actual)
    }
}