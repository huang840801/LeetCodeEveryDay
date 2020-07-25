package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode1399
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1399Test {

    private lateinit var leetCode : LeetCode1399

    @Before
    fun setUp() {

        leetCode = LeetCode1399()
    }

    @Test
    fun testCountLargestGroup1() {

        val expected = 4

        val actual = leetCode.countLargestGroup(13)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountLargestGroup2() {

        val expected = 2

        val actual = leetCode.countLargestGroup(2)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountLargestGroup3() {

        val expected = 6

        val actual = leetCode.countLargestGroup(15)

        assertEquals(expected, actual)
    }

    @Test
    fun testCountLargestGroup4() {

        val expected = 5

        val actual = leetCode.countLargestGroup(24)

        assertEquals(expected, actual)
    }
}