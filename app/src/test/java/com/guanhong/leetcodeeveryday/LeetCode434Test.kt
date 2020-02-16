package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode434Test {

    private lateinit var leetCode : LeetCode434

    @Before
    fun setUp() {

        leetCode = LeetCode434()
    }

    @Test
    fun testCountSegments(){

        val actual = leetCode.countSegments("Hello, my name is John")
        val expected = 5

        assertEquals(expected, actual)
    }
}