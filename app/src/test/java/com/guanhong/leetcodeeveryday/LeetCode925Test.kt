package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode925Test {

    private lateinit var leetCode : LeetCode925

    @Before
    fun setUp() {

        leetCode = LeetCode925()
    }

    @Test
    fun testIsLongPressedName1() {

        val actual = leetCode.isLongPressedName("alex", "aaleex")

        assertTrue(actual)
    }

    @Test
    fun testIsLongPressedName2() {

        val actual = leetCode.isLongPressedName("leelee", "lleeelee")

        assertTrue(actual)
    }

    @Test
    fun testIsLongPressedName3() {

        val actual = leetCode.isLongPressedName("saeed", "ssaaedd")

        assertFalse(actual)
    }

    @Test
    fun testIsLongPressedName4() {

        val actual = leetCode.isLongPressedName("laiden", "laiden")

        assertTrue(actual)
    }

    @Test
    fun testIsLongPressedName5() {

        val actual = leetCode.isLongPressedName("a", "a")

        assertTrue(actual)
    }

    @Test
    fun testIsLongPressedName6() {

        val actual = leetCode.isLongPressedName("laidez", "laideccc")

        assertFalse(actual)
    }
}