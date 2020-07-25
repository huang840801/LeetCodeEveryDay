package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1009
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1009Test {

    private lateinit var leetCode : LeetCode1009

    @Before
    fun setUp() {

        leetCode = LeetCode1009()
    }

    @Test
    fun testBitwiseComplement1() {

        val expected = 2
        val actual = leetCode.bitwiseComplement(5)

        assertEquals(expected, actual)
    }

    @Test
    fun testBitwiseComplement2() {

        val expected = 0
        val actual = leetCode.bitwiseComplement(7)

        assertEquals(expected, actual)
    }

    @Test
    fun testBitwiseComplement3() {

        val expected = 5
        val actual = leetCode.bitwiseComplement(10)

        assertEquals(expected, actual)
    }

    @Test
    fun testBitwiseComplement4() {

        val expected = 15
        val actual = leetCode.bitwiseComplement(16)

        assertEquals(expected, actual)
    }

    @Test
    fun testBitwiseComplement5() {

        val expected = 0
        val actual = leetCode.bitwiseComplement(15)

        assertEquals(expected, actual)
    }
}