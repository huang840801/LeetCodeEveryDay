package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode205
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode205Test {

    private lateinit var leetCode205 : LeetCode205

    @Before
    fun setUp() {

        leetCode205 = LeetCode205()
    }

    @Test
    fun testIsIsomorphic1() {

        val actual = leetCode205.isIsomorphic("paper", "title")
        val expected = true

        assertEquals(expected, actual)
    }

    @Test
    fun testIsIsomorphic2() {

        val actual = leetCode205.isIsomorphic("egg", "add")
        val expected = true

        assertEquals(expected, actual)
    }

    @Test
    fun testIsIsomorphic3() {

        val actual = leetCode205.isIsomorphic("egg", "tit")
        val expected = false

        assertEquals(expected, actual)
    }

    @Test
    fun testIsIsomorphic4() {

        val actual = leetCode205.isIsomorphic("foo", "bar")
        val expected = false

        assertEquals(expected, actual)
    }

    @Test
    fun testIsIsomorphic5() {

        val actual = leetCode205.isIsomorphic("", "")
        val expected = true

        assertEquals(expected, actual)
    }

    @Test
    fun testIsIsomorphic6() {

        val actual = leetCode205.isIsomorphic("ab", "aa")
        val expected = false

        assertEquals(expected, actual)
    }
}