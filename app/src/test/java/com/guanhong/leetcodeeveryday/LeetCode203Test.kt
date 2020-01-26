package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode203Test {

    private lateinit var leetCode203 : LeetCode203

    @Before
    fun setUp() {

        leetCode203 = LeetCode203()
    }

    @Test
    fun testRemoveElements() {

        val listNode1 = ListNode(2)

        val listNode2 = ListNode(3)

        listNode1.next = listNode2

        val listNode3 = ListNode(5)

        listNode2.next = listNode3

        val listNode4 = ListNode(7)

        listNode3.next = listNode4

        val actual = leetCode203.removeElements(listNode1, 3)?.next?.`val`
        val expected = 5

        assertEquals(expected, actual)
    }
}