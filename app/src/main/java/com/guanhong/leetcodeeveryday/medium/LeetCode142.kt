package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode142 {

    fun detectCycle(head : ListNode?) : ListNode? {

        val listNodeList = mutableListOf<ListNode>()

        var temp : ListNode? = head

        while (temp != null) {

            if (listNodeList.contains(temp)) {

                return temp
            }

            val node = temp

            listNodeList.add(node)

            temp = temp.next
        }
        return null
    }
}