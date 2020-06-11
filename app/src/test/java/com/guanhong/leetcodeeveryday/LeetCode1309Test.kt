package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1309Test {

    private lateinit var leetCode : LeetCode1309

    @Before
    fun setUp() {

        leetCode = LeetCode1309()
    }

    @Test
    fun testFreqAlphabets1() {

        val expected = "jkab"
        val actual = leetCode.freqAlphabets("10#11#12")

        assertEquals(expected, actual)
    }

    @Test
    fun testFreqAlphabets2() {

        val expected = "abcdefghijklmnopqrstuvwxyz"
        val actual =
            leetCode.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#")

        assertEquals(expected, actual)
    }

    @Test
    fun testFreqAlphabets3() {

        val expected = "jka"
        val actual =
            leetCode.freqAlphabets("10#11#1")

        assertEquals(expected, actual)
    }

    @Test
    fun testFreqAlphabets4() {

        val expected = "acz"
        val actual =
            leetCode.freqAlphabets("1326#")

        assertEquals(expected, actual)
    }
}