package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.medium.LeetCode36
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode36Test {

    private lateinit var leetCode : LeetCode36

    @Before
    fun setUp() {

        leetCode = LeetCode36()
    }

    @Test
    fun testIsValid1() {

        val actual = leetCode.isValid(charArrayOf('1', '.', '.', '.', '.', '.', '.', '.', '2'))

        assertTrue(actual)
    }

    @Test
    fun testIsValid2() {

        val actual = leetCode.isValid(charArrayOf('1', '.', '.', '.', '.', '.', '.', '.', '1'))

        assertFalse(actual)
    }

    @Test
    fun testIsValid3() {

        val actual = leetCode.isValid(charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9'))

        assertTrue(actual)
    }

    @Test
    fun testIsValid4() {

        val actual = leetCode.isValid(charArrayOf('1', '2', '3', '4', '1', '6', '7', '8', '9'))

        assertFalse(actual)
    }

    @Test
    fun testIsValidSudoku() {

        val actual = leetCode.isValidSudoku(
            arrayOf(
                charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
                charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
            )
        )
        assertTrue(actual)
    }

    @Test
    fun testIsValidSudoku2() {

        val actual = leetCode.isValidSudoku(
            arrayOf(
                charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
                charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
            )
        )
        assertFalse(actual)
    }
}