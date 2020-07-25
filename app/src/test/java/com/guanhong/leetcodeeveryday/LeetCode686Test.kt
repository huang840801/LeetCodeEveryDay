package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode686
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode686Test {

    private lateinit var leetCode : LeetCode686

    @Before
    fun setUp() {

        leetCode = LeetCode686()
    }

    @Test
    fun testRepeatedStringMatch1() {

        val actual = leetCode.repeatedStringMatch("abcd", "cdabcdab")
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testRepeatedStringMatch2() {

        val actual = leetCode.repeatedStringMatch("abc", "bca")
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testRepeatedStringMatch3() {

        val actual = leetCode.repeatedStringMatch("ab", "bca")
        val expected = -1

        assertEquals(expected, actual)
    }

    @Test
    fun testRepeatedStringMatch4() {

        val actual = leetCode.repeatedStringMatch("ab", "ba")
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testRepeatedStringMatch5() {

        val actual = leetCode.repeatedStringMatch("abcd", "dcba")
        val expected = -1

        assertEquals(expected, actual)
    }

    @Test
    fun testRepeatedStringMatch6() {

        val actual = leetCode.repeatedStringMatch("a", "a")
        val expected = 1

        assertEquals(expected, actual)
    }

    @Test
    fun testRepeatedStringMatch7() {

        val actual = leetCode.repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab", "ba")
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testRepeatedStringMatch8() {

        val actual = leetCode.repeatedStringMatch("abcbc", "cabcbca")
        val expected = 3

        assertEquals(expected, actual)
    }
}