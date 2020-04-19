package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode929Test {

    private lateinit var leetCode : LeetCode929

    @Before
    fun setUp() {

        leetCode = LeetCode929()
    }

    @Test
    fun testNumUniqueEmails1() {

        val actual = leetCode.numUniqueEmails(
            arrayOf(
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
            )
        )

        assertEquals(2, actual)
    }

    @Test
    fun testNumUniqueEmails2() {

        val actual = leetCode.numUniqueEmails(
            arrayOf(
                "a@leetcode.com",
                "b@leetcode.com",
                "c@leetcode.com"
            )
        )

        assertEquals(3, actual)
    }

    @Test
    fun testNumUniqueEmails3() {

        val actual = leetCode.numUniqueEmails(
            arrayOf(
                "test.email+alex@leetcode.com",
                "test.email.leet+alex@code.com"
            )
        )

        assertEquals(2, actual)
    }
}