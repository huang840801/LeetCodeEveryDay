package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode206 {

    fun reverseList(head : ListNode?) : ListNode? {

        if (head == null) return null

        val tempListNodeList = mutableListOf<Int>()

        var tempListNode = head

        while (tempListNode != null) {

            tempListNodeList.add(tempListNode.`val`)

            tempListNode = tempListNode.next
        }

        val reversedList = tempListNodeList.reversed()

        val answer = ListNode(reversedList.first())

        var temp = answer

        for (index in 1 until reversedList.count()) {

            val listNode = ListNode(reversedList[index])

            temp.next = listNode

            temp = listNode
        }

        return answer
    }
}