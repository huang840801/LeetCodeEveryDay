package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1013
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1013Test {

    private lateinit var leetCode : LeetCode1013

    @Before
    fun setUp() {

        leetCode = LeetCode1013()
    }

    @Test
    fun testCanThreePartsEqualSum1() {

        val actual = leetCode.canThreePartsEqualSum(intArrayOf(1, 1, 2, 2))

        assertTrue(actual)
    }

    @Test
    fun testCanThreePartsEqualSum2() {

        val actual = leetCode.canThreePartsEqualSum(intArrayOf(0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1))

        assertTrue(actual)
    }

    @Test
    fun testCanThreePartsEqualSum3() {

        val actual = leetCode.canThreePartsEqualSum(intArrayOf(3, 3, 6, 5, -2, 2, 5, 1, -9, 4))

        assertTrue(actual)
    }

    @Test
    fun testCanThreePartsEqualSum4() {

        val actual = leetCode.canThreePartsEqualSum(intArrayOf(1, 1, 1))

        assertTrue(actual)
    }

    @Test
    fun testCanThreePartsEqualSum5() {

        val actual = leetCode.canThreePartsEqualSum(intArrayOf(1, 1, 0))

        assertFalse(actual)
    }

    @Test
    fun testCanThreePartsEqualSum6() {

        val actual = leetCode.canThreePartsEqualSum(intArrayOf(18, 12, -18, 18, -19, -1, 10, 10))

        assertTrue(actual)
    }
}