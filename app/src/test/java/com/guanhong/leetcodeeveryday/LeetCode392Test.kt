package com.guanhong.leetcodeeveryday

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class LeetCode392Test{

    private lateinit var leetCode: LeetCode392

    @Before
    fun setUp() {

        leetCode = LeetCode392()
    }

    @Test
    fun isSubsequence1() {

        val actual = leetCode.isSubsequence("abc","ahbgdc")

        assertTrue(actual)
    }
    @Test
    fun isSubsequence2() {

        val actual = leetCode.isSubsequence("acb","ahbgdc")

        assertFalse(actual)
    }
    @Test
    fun isSubsequence3() {

        val actual = leetCode.isSubsequence("axc","ahbgdc")

        assertFalse(actual)
    }
    @Test
    fun isSubsequence4() {

        val actual = leetCode.isSubsequence("a","aaa")

        assertTrue(actual)
    }
    @Test
    fun isSubsequence5() {

        val actual = leetCode.isSubsequence("","aaa")

        assertTrue(actual)
    }
}