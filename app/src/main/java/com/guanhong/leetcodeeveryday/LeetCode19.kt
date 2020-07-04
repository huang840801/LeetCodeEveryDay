package com.guanhong.leetcodeeveryday

class LeetCode19 {

    fun removeNthFromEnd(head : ListNode?, n : Int) : ListNode? {

        if (head == null) {

            return null
        }

        val list = mutableListOf<ListNode>()

        var tempListNode = head

        while (tempListNode != null) {

            list.add(tempListNode)

            tempListNode = tempListNode.next
        }

        val count = list.count()

        if (n == count) {

            return head.next
        }

        val nTh = count - n

        val nThPreNode = list[nTh - 1]

        val nThNextNode = if (nTh + 1 >= count) {

            null
        } else {

            list[nTh + 1]
        }

        nThPreNode.next = nThNextNode

        return list[0]
    }
}