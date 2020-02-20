package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1346Test {

    private lateinit var leetCode : LeetCode1346

    @Before
    fun setUp() {

        leetCode = LeetCode1346()
    }

    @Test
    fun testCheckIfExist1() {

        val actual = leetCode.checkIfExist(intArrayOf(3, 1, 7, 11))

        assertFalse(actual)
    }

    @Test
    fun testCheckIfExist2() {

        val actual = leetCode.checkIfExist(intArrayOf(14, 1, 7, 11))

        assertTrue(actual)
    }

    @Test
    fun testCheckIfExist3() {

        val actual = leetCode.checkIfExist(intArrayOf(-10, -20, -8))

        assertTrue(actual)
    }

    @Test
    fun testCheckIfExist4() {

        val actual = leetCode.checkIfExist(intArrayOf(-10, 12, -20, -8, 15))

        assertTrue(actual)
    }

    @Test
    fun testCheckIfExist5() {

        val actual = leetCode.checkIfExist(intArrayOf(0, 0))

        assertTrue(actual)
    }

    @Test
    fun testCheckIfExist6() {

        val actual = leetCode.checkIfExist(intArrayOf(-3, -7, -11))

        assertFalse(actual)
    }

    @Test
    fun testCheckIfExist7() {

        val actual = leetCode.checkIfExist(intArrayOf(-30, -7, -1, 0))

        assertFalse(actual)
    }

    @Test
    fun testCheckIfExist8() {

        val actual = leetCode.checkIfExist(intArrayOf(7, 8, 9, 14))

        assertTrue(actual)
    }
}