package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode849
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode849Test {

    private lateinit var leetCode : LeetCode849

    @Before
    fun setUp() {

        leetCode = LeetCode849()
    }

    @Test
    fun testMaxDistToClosest1() {

        val actual = leetCode.maxDistToClosest(intArrayOf(1, 0, 0, 0, 1, 0, 1))

        assertEquals(2, actual)
    }

    @Test
    fun testMaxDistToClosest2() {

        val actual = leetCode.maxDistToClosest(intArrayOf(1, 0, 0, 0))

        assertEquals(3, actual)
    }

    @Test
    fun testMaxDistToClosest3() {

        val actual = leetCode.maxDistToClosest(intArrayOf(0, 0, 0, 0, 1))

        assertEquals(4, actual)
    }

    @Test
    fun testMaxDistToClosest4() {

        val actual = leetCode.maxDistToClosest(intArrayOf(0, 0, 0, 0, 1, 0, 0))

        assertEquals(4, actual)
    }
}