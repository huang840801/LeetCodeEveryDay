package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode744Test {

    private lateinit var leetCode : LeetCode744

    @Before
    fun setUp() {

        leetCode = LeetCode744()
    }

    @Test
    fun testNextGreatestLetter1() {

        val actual = leetCode.nextGreatestLetter(charArrayOf('a', 'c'), 'a')

        val expected = 'c'

        assertEquals(expected, actual)
    }

    @Test
    fun testNextGreatestLetter2() {

        val actual = leetCode.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'k')

        val expected = 'c'

        assertEquals(expected, actual)
    }

    @Test
    fun testNextGreatestLetter3() {

        val actual = leetCode.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'j')

        val expected = 'c'

        assertEquals(expected, actual)
    }

    @Test
    fun testNextGreatestLetter4() {

        val actual = leetCode.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'a')

        val expected = 'c'

        assertEquals(expected, actual)
    }

    @Test
    fun testNextGreatestLetter5() {

        val actual = leetCode.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'c')

        val expected = 'f'

        assertEquals(expected, actual)
    }

    @Test
    fun testNextGreatestLetter6() {

        val actual = leetCode.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'd')

        val expected = 'f'

        assertEquals(expected, actual)
    }
}