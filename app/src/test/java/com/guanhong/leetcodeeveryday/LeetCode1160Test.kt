package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1160Test {

    private lateinit var leetCode : LeetCode1160

    @Before
    fun setUp() {

        leetCode = LeetCode1160()
    }

    @Test
    fun testCountCharacters1() {

        val expected = 6

        val actual = leetCode.countCharacters(arrayOf("cat", "bt", "hat", "tree"), "atach")
        assertEquals(expected, actual)
    }

    @Test
    fun testCountCharacters2() {

        val expected = 10

        val actual =
            leetCode.countCharacters(arrayOf("hello", "world", "leetcode"), "welldonehoneyr")
        assertEquals(expected, actual)
    }

    @Test
    fun testCountCharacters3() {

        val expected = 6

        val actual =
            leetCode.countCharacters(arrayOf("cat", "bt", "hat", "tree", "catcat"), "atach")
        assertEquals(expected, actual)
    }
}