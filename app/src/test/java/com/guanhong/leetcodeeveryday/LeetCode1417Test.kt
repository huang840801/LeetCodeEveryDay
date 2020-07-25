package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1417
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1417Test {

    private lateinit var leetCode : LeetCode1417

    @Before
    fun setUp() {

        leetCode = LeetCode1417()
    }

    @Test
    fun testReformat1() {

        val expected = "0a1b2c"
        val actual = leetCode.reformat("a0b1c2")

        assertEquals(expected, actual)
    }

    @Test
    fun testReformat2() {

        val expected = ""
        val actual = leetCode.reformat("leetcode")

        assertEquals(expected, actual)
    }

    @Test
    fun testReformat3() {

        val expected = ""
        val actual = leetCode.reformat("1229857369")

        assertEquals(expected, actual)
    }

    @Test
    fun testReformat4() {

        val expected = "c2o0v1i9d"
        val actual = leetCode.reformat("covid2019")

        assertEquals(expected, actual)
    }

    @Test
    fun testReformat5() {

        val expected = "1a2b3"
        val actual = leetCode.reformat("ab123")

        assertEquals(expected, actual)
    }

    @Test
    fun testReformat6() {

        val expected = ""
        val actual = leetCode.reformat("abpoc123")

        assertEquals(expected, actual)
    }
}