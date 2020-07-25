package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode953
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode953Test {

    private lateinit var leetCode : LeetCode953

    @Before
    fun setUp() {

        leetCode = LeetCode953()
    }

    @Test
    fun testIsAlienSorted1() {

        val actual =
            leetCode.isAlienSorted(arrayOf("h", "l", "lhkjyg"), "hlabcdefgijkmnopqrstuvwxyz")

        assertTrue(actual)
    }

    @Test
    fun testIsAlienSorted2() {

        val actual =
            leetCode.isAlienSorted(arrayOf("hello", "leetcode"), "hlabcdefgijkmnopqrstuvwxyz")

        assertTrue(actual)
    }

    @Test
    fun testIsAlienSorted3() {

        val actual =
            leetCode.isAlienSorted(arrayOf("word", "world", "row"), "worldabcefghijkmnpqstuvxyz")

        assertFalse(actual)
    }

    @Test
    fun testIsAlienSorted4() {

        val actual =
            leetCode.isAlienSorted(arrayOf("apple", "app"), "abcdefghijklmnopqrstuvwxyz")

        assertFalse(actual)
    }

    @Test
    fun testIsAlienSorted5() {

        val actual =
            leetCode.isAlienSorted(
                arrayOf("h", "l", "lhkjyg", "world"),
                "hlabcdefgijkmnopqrstuvwxyz"
            )

        assertTrue(actual)
    }
}