package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode541Test {

    private lateinit var leetCode : LeetCode541

    @Before
    fun setUp() {

        leetCode = LeetCode541()
    }

    @Test
    fun testReverseStr1() {

        val actual = leetCode.reverseStr("abcdefg", 5)
        val expected = "edcbafg"

        assertEquals(expected, actual)
    }

    @Test
    fun testReverseStr2() {

        val actual = leetCode.reverseStr("abcdefg", 2)
        val expected = "bacdfeg"

        assertEquals(expected, actual)
    }

    @Test
    fun testReverseStr3() {

        val actual = leetCode.reverseStr("abcdefghi", 2)
        val expected = "bacdfeghi"

        assertEquals(expected, actual)
    }

    @Test
    fun testReverseStr4() {

        val actual = leetCode.reverseStr("abcdefghi", 3)
        val expected = "cbadefihg"

        assertEquals(expected, actual)
    }
    @Test
    fun testReverseStr5() {

        val actual = leetCode.reverseStr("abcdefghiy", 3)
        val expected = "cbadefihgy"

        assertEquals(expected, actual)
    }
    @Test
    fun testReverseStr6() {

        val actual = leetCode.reverseStr(
            "abcdefg",
            3)
        val expected =
            "cbadefg"

        assertEquals(expected, actual)
    }
    @Test
    fun testReverseStr7() {

        val actual = leetCode.reverseStr(
            "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",
            39)
        val expected =
               "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi"

        assertEquals(expected, actual)
    }
}