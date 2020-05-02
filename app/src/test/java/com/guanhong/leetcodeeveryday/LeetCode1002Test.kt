package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1002Test {

    private lateinit var leetCode : LeetCode1002

    @Before
    fun setUp() {

        leetCode = LeetCode1002()
    }

    @Test
    fun testCommonChars1() {

        val expected = listOf("e", "l", "l").toTypedArray()
        val actual = leetCode.commonChars(arrayOf("bella", "label", "roller")).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testCommonChars2() {

        val expected = listOf("c", "o").toTypedArray()
        val actual = leetCode.commonChars(arrayOf("cool", "lock", "cook")).toTypedArray()

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testCommonChars3() {

        val expected = arrayOf<String>()
        val actual = leetCode.commonChars(
            arrayOf(
                "aabccddd",
                "bbbbccdd",
                "aabbbddd",
                "cbdddcac",
                "aacbcccd",
                "ccccddda",
                "cababaab",
                "addcaccd"
            )
        ).toTypedArray()

        assertArrayEquals(expected, actual)
    }
}