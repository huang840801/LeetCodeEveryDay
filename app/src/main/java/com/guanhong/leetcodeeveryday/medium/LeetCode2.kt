package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode2 {

    fun addTwoNumbers(l1 : ListNode?, l2 : ListNode?) : ListNode? {

        val listNode = ListNode(0)

        val l1Num = l1!!.`val`
        val l2Num = l2!!.`val`

        val sum = l1Num + l2Num

        listNode.`val` = sum % 10
        listNode.next = helper(l1.next, l2.next, sum > 9)

        return listNode
    }

    private fun helper(l1 : ListNode?, l2 : ListNode?, isCarry : Boolean) : ListNode? {

        if (l1 == null && l2 == null) {

            return if (isCarry) ListNode(1) else null
        }

        val listNode = ListNode(0)

        val l1Num = l1?.`val` ?: 0
        val l2Num = l2?.`val` ?: 0

        var sum = l1Num + l2Num

        if (isCarry) sum += 1

        listNode.`val` = sum % 10
        listNode.next = helper(l1?.next, l2?.next, sum > 9)

        return listNode
    }
}