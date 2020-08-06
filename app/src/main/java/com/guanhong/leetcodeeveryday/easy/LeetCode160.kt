package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode160 {

    fun getIntersectionNode(headA : ListNode?, headB : ListNode?) : ListNode? {

        val list = mutableListOf<ListNode>()

        var temp : ListNode? = headA

        while (temp != null) {

            list.add(temp)

            temp = temp.next
        }

        temp = headB

        while (temp != null) {

            val firstOrNull = list.firstOrNull {

                it == temp
            }

            if (firstOrNull != null) {

                return firstOrNull
            }
        }

        return null
    }
}