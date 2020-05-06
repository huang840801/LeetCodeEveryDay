package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1021Test {

    private lateinit var leetCode : LeetCode1021

    @Before
    fun setUp() {

        leetCode = LeetCode1021()
    }

    @Test
    fun testRemoveOuterParentheses1() {

        val expected = "()()()"
        val actual = leetCode.removeOuterParentheses("(()())(())")

        assertEquals(expected, actual)
    }

    @Test
    fun testRemoveOuterParentheses2() {

        val expected = "()()()()(())"
        val actual = leetCode.removeOuterParentheses("(()())(())(()(()))")

        assertEquals(expected, actual)
    }

    @Test
    fun testRemoveOuterParentheses3() {

        val expected = ""
        val actual = leetCode.removeOuterParentheses("()()")

        assertEquals(expected, actual)
    }
}