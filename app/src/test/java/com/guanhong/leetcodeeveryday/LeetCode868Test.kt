package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode868Test {

    private lateinit var leetCode : LeetCode868

    @Before
    fun setUp() {

        leetCode = LeetCode868()
    }

    @Test
    fun testBinaryGap1() {

        val actual = leetCode.binaryGap(22)

        assertEquals(2, actual)
    }

    @Test
    fun testBinaryGap2() {

        val actual = leetCode.binaryGap(5)

        assertEquals(2, actual)
    }

    @Test
    fun testBinaryGap3() {

        val actual = leetCode.binaryGap(6)

        assertEquals(1, actual)
    }

    @Test
    fun testBinaryGap4() {

        val actual = leetCode.binaryGap(8)

        assertEquals(0, actual)
    }

    @Test
    fun testBinaryGap5() {

        val actual = leetCode.binaryGap(10)

        assertEquals(2, actual)
    }

    @Test
    fun testBinaryGap6() {

        val actual = leetCode.binaryGap(100)

        assertEquals(3, actual)
    }
}