package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode859Test {

    private lateinit var leetCode : LeetCode859

    @Before
    fun setUp() {

        leetCode = LeetCode859()
    }

    @Test
    fun testBuddyStrings1() {

        val actual = leetCode.buddyStrings("ab", "ba")

        assertTrue(actual)
    }
    @Test
    fun testBuddyStrings2() {

        val actual = leetCode.buddyStrings("ab", "ab")

        assertFalse(actual)
    }
    @Test
    fun testBuddyStrings3() {

        val actual = leetCode.buddyStrings("aa", "aa")

        assertTrue(actual)
    }
    @Test
    fun testBuddyStrings4() {

        val actual = leetCode.buddyStrings("aaaaaaabc", "aaaaaaacb")

        assertTrue(actual)
    }
    @Test
    fun testBuddyStrings5() {

        val actual = leetCode.buddyStrings("", "aa")

        assertFalse(actual)
    }
}