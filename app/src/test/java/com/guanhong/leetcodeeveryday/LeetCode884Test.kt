package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode884Test {

    private lateinit var leetCode : LeetCode884

    @Before
    fun setUp() {

        leetCode = LeetCode884()
    }

    @Test
    fun testUncommonFromSentences1() {

        val actual = leetCode.uncommonFromSentences("this apple is sweet", "this apple is sour")
        val expected = arrayOf("sweet", "sour")

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testUncommonFromSentences2() {

        val actual = leetCode.uncommonFromSentences("apple apple", "banana")
        val expected = arrayOf("banana")

        assertArrayEquals(expected, actual)
    }

    @Test
    fun testUncommonFromSentences3() {

        val actual = leetCode.uncommonFromSentences("apple apple", "")
        val expected = arrayOf<String>()

        assertArrayEquals(expected, actual)
    }
}