package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode148 {

    fun sortList(head : ListNode?) : ListNode? {

        if (head == null) return null

        val list = mutableListOf<Int>()

        var temp = head

        while (temp != null) {

            list.add(temp.`val`)
            temp = temp.next
        }

        val sortedList = list.sorted()

        val answer = ListNode(sortedList.first())

        temp = answer

        sortedList.forEachIndexed { index, it ->

            if (index > 0) {
                val listNode = ListNode(it)
                temp!!.next = listNode
                temp = listNode
            }
        }

        return answer
    }
}