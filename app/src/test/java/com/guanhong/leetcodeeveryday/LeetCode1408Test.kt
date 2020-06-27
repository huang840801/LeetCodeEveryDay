package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1408Test {

    private lateinit var leetCode : LeetCode1408

    @Before
    fun setUp() {

        leetCode = LeetCode1408()
    }

    @Test
    fun testStringMatching1() {

        val expected = listOf("as", "hero")
        val actual = leetCode.stringMatching(arrayOf("mass", "as", "hero", "superhero"))

        assertEquals(expected, actual)
    }

    @Test
    fun testStringMatching2() {

        val expected = listOf("et", "code")
        val actual = leetCode.stringMatching(arrayOf("leetcode", "et", "code"))

        assertEquals(expected, actual)
    }

    @Test
    fun testStringMatching3() {

        val expected = listOf<String>()
        val actual = leetCode.stringMatching(arrayOf("blue", "green", "bu"))

        assertEquals(expected, actual)
    }
}