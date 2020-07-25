package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode796
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode796Test {

    private lateinit var leetCode : LeetCode796

    @Before
    fun setUp() {

        leetCode = LeetCode796()
    }

    @Test
    fun testRotateString1() {

        val actual = leetCode.rotateString("abcde", "cdeab")

        assertTrue(actual)
    }

    @Test
    fun testRotateString2() {

        val actual = leetCode.rotateString("abcde", "abced")

        assertFalse(actual)
    }

    @Test
    fun testRotateString3() {

        val actual = leetCode.rotateString("abac", "acba")

        assertFalse(actual)
    }
}