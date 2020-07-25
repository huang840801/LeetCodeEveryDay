package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode405
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode405Test {

    private lateinit var leetCode : LeetCode405

    @Before
    fun setUp() {

        leetCode = LeetCode405()
    }

    @Test
    fun testToHex1() {

        val actual = leetCode.toHex(17)
        val expected = "11"

        assertEquals(expected, actual)
    }

    @Test
    fun testToHex2() {

        val actual = leetCode.toHex(26)
        val expected = "1a"

        assertEquals(expected, actual)
    }

    @Test
    fun testToHex3() {

        val actual = leetCode.toHex(-1)
        val expected = "ffffffff"

        assertEquals(expected, actual)
    }

    @Test
    fun testToHex4() {

        val actual = leetCode.toHex(-1555)
        val expected = "fffff9ed"

        assertEquals(expected, actual)
    }

    @Test
    fun testToHex5() {

        val actual = leetCode.toHex(0)
        val expected = "0"

        assertEquals(expected, actual)
    }

    @Test
    fun testToHex6() {

        val actual = leetCode.toHex(15)
        val expected = "f"

        assertEquals(expected, actual)
    }

    @Test
    fun testToHex7() {

        val actual = leetCode.toHex(32)
        val expected = "20"

        assertEquals(expected, actual)
    }

    @Test
    fun testToHex8() {

        val actual = leetCode.toHex(16)
        val expected = "10"

        assertEquals(expected, actual)
    }

    @Test
    fun testToHex9() {

        val actual = leetCode.toHex(48)
        val expected = "30"

        assertEquals(expected, actual)
    }
}