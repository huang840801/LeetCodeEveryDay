package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode762Test {

    private lateinit var leetCode : LeetCode762

    @Before
    fun setUp() {

        leetCode = LeetCode762()
    }

    @Test
    fun testCountPrimeSetBits1() {

        val actual = leetCode.decimalToBinary(0)
        val expected = "0"

        assertEquals(expected, actual)
    }

    @Test
    fun testCountPrimeSetBits2() {

        val actual = leetCode.decimalToBinary(1)
        val expected = "1"

        assertEquals(expected, actual)
    }

    @Test
    fun testCountPrimeSetBits3() {

        val actual = leetCode.decimalToBinary(2)
        val expected = "10"

        assertEquals(expected, actual)
    }

    @Test
    fun testCountPrimeSetBits4() {

        val actual = leetCode.decimalToBinary(3)
        val expected = "11"

        assertEquals(expected, actual)
    }

    @Test
    fun testCountPrimeSetBits5() {

        val actual = leetCode.decimalToBinary(4)
        val expected = "100"

        assertEquals(expected, actual)
    }

    @Test
    fun testCountPrimeSetBits6() {

        val actual = leetCode.decimalToBinary(8)
        val expected = "1000"

        assertEquals(expected, actual)
    }

    @Test
    fun testCountPrimeSetBits7() {

        val actual = leetCode.decimalToBinary(9)
        val expected = "1001"

        assertEquals(expected, actual)
    }

    @Test
    fun testIsPrime1() {

        val actual = leetCode.isPrime(2)

        assertTrue(actual)
    }

    @Test
    fun testIsPrime2() {

        val actual = leetCode.isPrime(3)

        assertTrue(actual)
    }

    @Test
    fun testIsPrime3() {

        val actual = leetCode.isPrime(5)

        assertTrue(actual)
    }

    @Test
    fun testIsPrime4() {

        val actual = leetCode.isPrime(7)

        assertTrue(actual)
    }

    @Test
    fun testIsPrime5() {

        val actual = leetCode.isPrime(23)

        assertTrue(actual)
    }

    @Test
    fun testIsPrime6() {

        val actual = leetCode.isPrime(4)

        assertFalse(actual)
    }

    @Test
    fun testIsPrime7() {

        val actual = leetCode.isPrime(6)

        assertFalse(actual)
    }

    @Test
    fun testIsPrime8() {

        val actual = leetCode.isPrime(9)

        assertFalse(actual)
    }

    @Test
    fun testIsPrime9() {

        val actual = leetCode.isPrime(100)

        assertFalse(actual)
    }
}