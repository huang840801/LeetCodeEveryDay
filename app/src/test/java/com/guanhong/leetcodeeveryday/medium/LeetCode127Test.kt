package com.guanhong.leetcodeeveryday.medium

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode127Test {

    private lateinit var leetCode : LeetCode127

    @Before
    fun setUp() {

        leetCode = LeetCode127()
    }

    @Test
    fun test1() {

        val expected = 5
        val actual = leetCode.ladderLength(
            "hit",
            "cog",
            listOf(
                "hot", "dot", "dog", "lot", "log", "cog"
            )
        )

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {

        val expected = 2
        val actual = leetCode.ladderLength(
            "hit",
            "hig",
            listOf(
                "hig", "dot", "dog", "lot", "log", "cog"
            )
        )

        assertEquals(expected, actual)
    }

    @Test
    fun test3() {

        val expected = 0
        val actual = leetCode.ladderLength(
            "hit",
            "cog",
            listOf(
                "hot", "dot", "dog", "lot", "log"
            )
        )

        assertEquals(expected, actual)
    }

    @Test
    fun test4() {

        val expected = 0
        val actual = leetCode.ladderLength(
            "hot",
            "dog",
            listOf(
                "hot", "dog"
            )
        )

        assertEquals(expected, actual)
    }

    @Test
    fun testADiffLetter1() {

        val actual = leetCode.onlyALetterDiff("hit", "hot")

        assertTrue(actual)
    }

    @Test
    fun testADiffLetter2() {

        val actual = leetCode.onlyALetterDiff("hit", "hiu")

        assertTrue(actual)
    }

    @Test
    fun testADiffLetter3() {

        val actual = leetCode.onlyALetterDiff("hit", "iit")

        assertTrue(actual)
    }

    @Test
    fun testADiffLetter4() {

        val actual = leetCode.onlyALetterDiff("hit", "abc")

        assertFalse(actual)
    }

    @Test
    fun testADiffLetter5() {

        val actual = leetCode.onlyALetterDiff("hit", "hit")

        assertFalse(actual)
    }
}