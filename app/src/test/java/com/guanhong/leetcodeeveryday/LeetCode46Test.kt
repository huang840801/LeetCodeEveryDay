package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode168
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode46Test {

    private lateinit var leetCode168 : LeetCode168

    @Before
    fun setUp() {

        leetCode168 = LeetCode168()
    }

    @Test
    fun convertToTitle1() {

        val actual = leetCode168.convertToTitle(1)
        val expected = "A"

        assertEquals(expected, actual)
    }

    @Test
    fun convertToTitle2() {

        val actual = leetCode168.convertToTitle(28)
        val expected = "AB"

        assertEquals(expected, actual)
    }

    @Test
    fun convertToTitle3() {

        val actual = leetCode168.convertToTitle(701)
        val expected = "ZY"

        assertEquals(expected, actual)
    }

    @Test
    fun convertToTitle4() {

        val actual = leetCode168.convertToTitle(52)
        val expected = "AZ"

        assertEquals(expected, actual)
    }

    @Test
    fun convertToTitle5() {

        val actual = leetCode168.convertToTitle(27)
        val expected = "AA"

        assertEquals(expected, actual)
    }

    @Test
    fun convertToTitle6() {

        val actual = leetCode168.convertToTitle(26)
        val expected = "Z"

        assertEquals(expected, actual)
    }

    @Test
    fun convertToTitle7() {

        val actual = leetCode168.convertToTitle(0)
        val expected = ""

        assertEquals(expected, actual)
    }

    @Test
    fun convertToTitle8() {

        val actual = leetCode168.convertToTitle(1048)
        val expected = "ANH"

        assertEquals(expected, actual)
    }
}