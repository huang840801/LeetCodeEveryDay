package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode39Test {

    private lateinit var leetCode : LeetCode39

    @Before
    fun setUp() {

        leetCode = LeetCode39()
    }

    @Test
    fun testCombinationSum1() {

        val expected = listOf(listOf(2))
        val actual = leetCode.combinationSum(intArrayOf(2), 2)

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected))
    }

    @Test
    fun testCombinationSum2() {

        val expected = listOf(listOf(2))
        val actual = leetCode.combinationSum(intArrayOf(2, 3), 2)

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected))
    }

    @Test
    fun testCombinationSum3() {

        val expected = listOf(listOf(3))
        val actual = leetCode.combinationSum(intArrayOf(2, 3), 3)

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected))
    }

    @Test
    fun testCombinationSum4() {

        val expected = listOf(listOf(2, 3))
        val actual = leetCode.combinationSum(intArrayOf(2, 3), 5)

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected))
    }

    @Test
    fun testCombinationSum5() {

        val expected = listOf(listOf(2, 2, 3), listOf(7))
        val actual = leetCode.combinationSum(intArrayOf(2, 3, 6, 7), 7)

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected))
    }

    @Test
    fun testCombinationSum6() {

        val expected = listOf(
            listOf(1, 1, 1, 1, 1),
            listOf(1, 2, 2),
            listOf(1, 1, 1, 2),
            listOf(1, 1, 3),
            listOf(2, 3)
        )
        val actual = leetCode.combinationSum(intArrayOf(1, 2, 3), 5)

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected))
    }

    @Test
    fun testCombinationSum7() {

        val expected = listOf(
            listOf(2, 2, 2, 2),
            listOf(2, 3, 3),
            listOf(3, 5)
        )
        val actual = leetCode.combinationSum(intArrayOf(2, 3, 5), 8)

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected))
    }
}