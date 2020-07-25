package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode917
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode917Test {

    private lateinit var leetCode : LeetCode917

    @Before
    fun setUp() {

        leetCode = LeetCode917()
    }

    @Test
    fun testReverseOnlyLetters1() {

        val actual = leetCode.reverseOnlyLetters("ab-cd")

        val expected = "dc-ba"

        assertEquals(expected, actual)
    }

    @Test
    fun testReverseOnlyLetters2() {

        val actual = leetCode.reverseOnlyLetters("a-bC-dEf-ghIj")

        val expected = "j-Ih-gfE-dCba"

        assertEquals(expected, actual)
    }

    @Test
    fun testReverseOnlyLetters3() {

        val actual = leetCode.reverseOnlyLetters("Test1ng-Leet=code-Q!")

        val expected = "Qedo1ct-eeLg=ntse-T!"

        assertEquals(expected, actual)
    }

    @Test
    fun testReverseOnlyLetters4() {

        val actual = leetCode.reverseOnlyLetters("ab-")

        val expected = "ba-"

        assertEquals(expected, actual)
    }

    @Test
    fun testReverseOnlyLetters5() {

        val actual = leetCode.reverseOnlyLetters("")

        val expected = ""

        assertEquals(expected, actual)
    }

    @Test
    fun testReverseOnlyLetters6() {

        val actual = leetCode.reverseOnlyLetters("a")

        val expected = "a"

        assertEquals(expected, actual)
    }
}