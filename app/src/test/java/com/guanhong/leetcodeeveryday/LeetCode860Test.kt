package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode860
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode860Test {

    private lateinit var leetCode : LeetCode860

    @Before
    fun setUp() {

        leetCode = LeetCode860()
    }

    @Test
    fun testLemonadeChange1() {

        val actual = leetCode.lemonadeChange(intArrayOf(5, 5, 5, 10, 20))

        assertTrue(actual)
    }

    @Test
    fun testLemonadeChange2() {

        val actual = leetCode.lemonadeChange(intArrayOf(5, 5, 10))

        assertTrue(actual)
    }

    @Test
    fun testLemonadeChange3() {

        val actual = leetCode.lemonadeChange(intArrayOf(10, 10))

        assertFalse(actual)
    }

    @Test
    fun testLemonadeChange4() {

        val actual = leetCode.lemonadeChange(intArrayOf(5, 5, 10, 10, 20))

        assertFalse(actual)
    }

    @Test
    fun testLemonadeChange5() {

        val actual = leetCode.lemonadeChange(intArrayOf(6))

        assertFalse(actual)
    }
}