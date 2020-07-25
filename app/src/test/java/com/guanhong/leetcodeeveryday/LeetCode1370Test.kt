package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1370
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1370Test {

    private lateinit var leetCode : LeetCode1370

    @Before
    fun setUp() {

        leetCode = LeetCode1370()
    }

    @Test
    fun testSortString1() {

        val expected = "abccbaabccba"
        val actual = leetCode.sortString("aaaabbbbcccc")

        assertEquals(expected, actual)
    }

    @Test
    fun testSortString2() {

        val expected = "art"
        val actual = leetCode.sortString("rat")

        assertEquals(expected, actual)
    }

    @Test
    fun testSortString3() {

        val expected = "cdelotee"
        val actual = leetCode.sortString("leetcode")

        assertEquals(expected, actual)
    }

    @Test
    fun testSortString4() {

        val expected = "ggggggg"
        val actual = leetCode.sortString("ggggggg")

        assertEquals(expected, actual)
    }

    @Test
    fun testSortString5() {

        val expected = "ops"
        val actual = leetCode.sortString("spo")

        assertEquals(expected, actual)
    }

    @Test
    fun testSortString6() {

        val expected = "a"
        val actual = leetCode.sortString("a")

        assertEquals(expected, actual)
    }
}