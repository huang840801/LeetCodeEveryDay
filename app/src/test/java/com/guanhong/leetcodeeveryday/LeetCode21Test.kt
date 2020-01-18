package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode21Test {

    private lateinit var leetCode21 : LeetCode21

    @Before
    fun setUp() {

        leetCode21 = LeetCode21()
    }

    @Test
    fun testMergeTwoLists1() {

        val listNode1 = ListNode(2)

        val listNode2 = ListNode(3)

        listNode1.next = listNode2

        val listNode3 = ListNode(5)

        listNode2.next = listNode3

        val listNode4 = ListNode(7)

        listNode3.next = listNode4

        val actual = leetCode21.mergeTwoLists(listNode1, ListNode(8))?.`val`
        val expected = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testMergeTwoLists2() {

        val listNode1 = ListNode(2)

        val listNode2 = ListNode(3)

        listNode1.next = listNode2

        val listNode3 = ListNode(5)

        listNode2.next = listNode3

        val listNode4 = ListNode(7)

        listNode3.next = listNode4

        val actual = leetCode21.mergeTwoLists(listNode1, ListNode(8))?.next?.`val`
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testMergeTwoLists3() {

        val listNode1 = ListNode(2)

        val listNode2 = ListNode(3)

        listNode1.next = listNode2

        val listNode3 = ListNode(5)

        listNode2.next = listNode3

        val listNode4 = ListNode(7)

        listNode3.next = listNode4

        val actual = leetCode21.mergeTwoLists(listNode1, ListNode(8))?.next?.next?.`val`
        val expected = 5

        assertEquals(expected, actual)
    }
}