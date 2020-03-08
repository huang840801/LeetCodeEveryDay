package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode551Test {

    private lateinit var leetCode : LeetCode551

    @Before
    fun setUp() {

        leetCode = LeetCode551()
    }

    @Test
    fun testCheckRecord() {

        val actual = leetCode.checkRecord("PPALLP")
        val expected = true

        assertEquals(expected, actual)
    }
}