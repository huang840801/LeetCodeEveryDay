package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode844Test {

    private lateinit var leetCode : LeetCode844

    @Before
    fun setUp() {

        leetCode = LeetCode844()
    }

    @Test
    fun testBackspaceCompare1() {

        val actual = leetCode.backspaceCompare("ab#c", "ac")

        assertTrue(actual)
    }

    @Test
    fun testBackspaceCompare2() {

        val actual = leetCode.backspaceCompare("ab##", "c#d#")

        assertTrue(actual)
    }

    @Test
    fun testBackspaceCompare3() {

        val actual = leetCode.backspaceCompare("a##c", "#a#c")

        assertTrue(actual)
    }

    @Test
    fun testBackspaceCompare4() {

        val actual = leetCode.backspaceCompare("a#c", "b")

        assertFalse(actual)
    }
}