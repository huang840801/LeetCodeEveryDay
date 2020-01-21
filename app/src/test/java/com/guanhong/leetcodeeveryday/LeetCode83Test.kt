package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode83Test {

    private lateinit var leetCode83 : LeetCode83

    @Before
    fun setUp() {

        leetCode83 = LeetCode83()
    }

    @Test
    fun testDeleteDuplicates(){

        val listNode1 = ListNode(2)

        val listNode2 = ListNode(2)

        listNode1.next = listNode2

        val listNode3 = ListNode(5)

        listNode2.next = listNode3

        val listNode4 = ListNode(5)

        listNode3.next = listNode4
        val listNode5 = ListNode(6)

        listNode4.next = listNode5

        val actual = leetCode83.deleteDuplicates(listNode1)!!.`val`
        val expected = 3

        assertEquals(expected, actual)
    }
}