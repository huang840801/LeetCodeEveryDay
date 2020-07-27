package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.medium.LeetCode22
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode22Test {

    private lateinit var leetCode : LeetCode22

    @Before
    fun setUp() {

        leetCode = LeetCode22()
    }

    @Test
    fun testGenerateParenthesis1() {

        val expected = listOf(
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
        )
        val actual = leetCode.generateParenthesis(3)

        assertEquals(expected, actual)
    }
}