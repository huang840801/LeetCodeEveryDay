package com.guanhong.leetcodeeveryday

import org.junit.Assert
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

        val expected = 4
        val actual = leetCode.test()

        Assert.assertEquals(expected, actual)
    }

    /**
     * 581
     */
    @Test
    fun testFindUnsortedSubarray() {

        val actual = leetCode.findUnsortedSubarray(intArrayOf(1, 2, 3, 4))
        val expected = 4

        Assert.assertEquals(expected, actual)
    }

    /**
     * 476
     */
    @Test
    fun testFindComplement() {

        val expected = leetCode.findComplement(5)
        val actual = 2

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testBinaryTransToDecimal() {

        val expected = leetCode.binaryTransToDecimal("1000")
        val actual = 8

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testDecimalTransToBinary() {

        val actual = leetCode.decimalTransToBinary(5)
        val expected = "101"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testCalculateRoot() {

        val actual = leetCode.calculateRoot(2, 2)
        val expected = 4

        Assert.assertEquals(expected, actual)
    }

    /**
     * 414
     */
    @Test
    fun testThirdMax() {

        val actual = leetCode.thirdMax(intArrayOf())
        val expected = 0

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testRecursiveThirdMax() {

        val actual = leetCode.recursiveThirdMax(intArrayOf(4, 5, 7, 2, 1), 0)
        val expected = 4

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testRemoveDuplicateElement() {

        val actual = leetCode.removeDuplicateElement(intArrayOf(2, 9, 6))
        val expected = intArrayOf(2, 9, 6)

        Assert.assertArrayEquals(expected, actual)
    }

    /**
     * 728
     */
    @Test
    fun testSelfDividingNumbers() {

        val actual = leetCode.selfDividingNumbers(1, 1)
        val expected = listOf(1)

        Assert.assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }

    /**
     * 977
     */
    @Test
    fun testSortedSquares() {

        val actual = leetCode.sortedSquares(intArrayOf(-5))
        val expected = intArrayOf(25)

        Assert.assertArrayEquals(expected, actual)
    }

    /**
     * 867
     */
    @Test
    fun testTranspose() {

        val actual = leetCode.transpose(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)))
        val expected = arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 6))

        Assert.assertArrayEquals(expected, actual)
    }

    /**
     * 970
     */
    @Test
    fun testPowerNumber() {

        val actual = leetCode.powerNumberMaxUnderBigNumber(27, 3, 0)
        val expected = 3

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testIsPower() {

        val actual = leetCode.isPower(5, 1)
        val expected = false

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testPower() {

        val actual = leetCode.power(1, 1)
        val expected = 9

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testPowerfulIntegers1() {

        val actual = leetCode.powerfulIntegers(2, 3, 10).toIntArray()
        val expected = intArrayOf(2, 3, 4, 5, 7, 9, 10)

        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun testPowerfulIntegers2() {

        val actual = leetCode.powerfulIntegers(1, 1, 1).toIntArray()
        val expected = intArrayOf()

        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun testPowerfulIntegers3() {

        val actual = leetCode.powerfulIntegers(1, 1, 2).toIntArray()
        val expected = intArrayOf(2)

        Assert.assertArrayEquals(expected, actual)
    }

    @Test
    fun testPowerfulIntegers4() {

        val actual = leetCode.powerfulIntegers(3, 5, 15).toIntArray()
        val expected = intArrayOf(2, 4, 6, 8, 10, 14)

        Assert.assertArrayEquals(expected, actual)
    }
}