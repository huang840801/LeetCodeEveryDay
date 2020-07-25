package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode665
import org.junit.Assert.*
import org.junit.Test

class LeetCode665Test {

    @Test
    fun testCheckPossibility1() {

        val leetCode665 = LeetCode665()

        val expected = true
        val actual = leetCode665.checkPossibility(intArrayOf(4, 2, 3))

        assertEquals(expected, actual)
    }

    @Test
    fun testCheckPossibility2() {

        val leetCode665 = LeetCode665()

        val expected = false
        val actual = leetCode665.checkPossibility(intArrayOf(4, 2, 1))

        assertEquals(expected, actual)
    }

    @Test
    fun testCheckPossibility3() {

        val leetCode665 = LeetCode665()

        val expected = true
        val actual = leetCode665.checkPossibility(intArrayOf(4, 2, 2))

        assertEquals(expected, actual)
    }

    @Test
    fun testCheckPossibility4() {

        val leetCode665 = LeetCode665()

        val expected = false
        val actual = leetCode665.checkPossibility(intArrayOf(3, 4, 2, 3))

        assertEquals(expected, actual)
    }

    @Test
    fun testCheckPossibility5() {

        val leetCode665 = LeetCode665()

        val expected = true
        val actual = leetCode665.checkPossibility(intArrayOf(2, 3, 3, 2, 4))

        assertEquals(expected, actual)
    }
}