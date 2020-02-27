package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode482Test {

    private lateinit var leetCode : LeetCode482

    @Before
    fun setUp() {

        leetCode = LeetCode482()
    }

    @Test
    fun testLicenseKeyFormatting1() {

        val actual = leetCode.licenseKeyFormatting("5F3Z-2e-9-w", 3)
        val expected = "5F-3Z2-E9W"

        assertEquals(expected, actual)
    }

    @Test
    fun testLicenseKeyFormatting2() {

        val actual = leetCode.licenseKeyFormatting("5F3Z-2e-9-w", 4)
        val expected = "5F3Z-2E9W"

        assertEquals(expected, actual)
    }

    @Test
    fun testLicenseKeyFormatting3() {

        val actual = leetCode.licenseKeyFormatting("2-5g-3-J", 2)
        val expected = "2-5G-3J"

        assertEquals(expected, actual)
    }
    @Test
    fun testLicenseKeyFormatting4() {

        val actual = leetCode.licenseKeyFormatting("2q-5g-3-J", 2)
        val expected = "2Q-5G-3J"

        assertEquals(expected, actual)
    }
}