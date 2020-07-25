package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode459
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode459Test {

    private lateinit var leetCode : LeetCode459

    @Before
    fun setUp() {

        leetCode = LeetCode459()
    }

    @Test
    fun testRepeatedSubstringPattern1() {

        val actual = leetCode.repeatedSubstringPattern("abcabc")

        assertTrue(actual)
    }

    @Test
    fun testRepeatedSubstringPattern2() {

        val actual = leetCode.repeatedSubstringPattern("abcaabca")

        assertTrue(actual)
    }

    @Test
    fun testRepeatedSubstringPattern3() {

        val actual = leetCode.repeatedSubstringPattern("aaaa")

        assertTrue(actual)
    }

    @Test
    fun testRepeatedSubstringPattern4() {

        val actual = leetCode.repeatedSubstringPattern("aaaab")

        assertFalse(actual)
    }

    @Test
    fun testRepeatedSubstringPattern5() {

        val actual = leetCode.repeatedSubstringPattern("abac")

        assertFalse(actual)
    }

    @Test
    fun testRepeatedSubstringPattern6() {

        val actual = leetCode.repeatedSubstringPattern("ababba")

        assertFalse(actual)
    }

    @Test
    fun testRepeatedSubstringPattern7() {

        val actual = leetCode.repeatedSubstringPattern("babbabbabbabbab")

        assertTrue(actual)
    }
}