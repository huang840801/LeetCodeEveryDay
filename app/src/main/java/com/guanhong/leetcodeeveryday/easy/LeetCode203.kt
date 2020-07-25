package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode203 {

    fun removeElements(head : ListNode?, `val` : Int) : ListNode? {

        if (head == null) return null

        var tempListNode = head
        val mutableList = mutableListOf<Int>()

        while (tempListNode != null) {

            if (tempListNode.`val` != `val`) {

                mutableList.add(tempListNode.`val`)
            }

            tempListNode = tempListNode.next
        }

        if (mutableList.isEmpty()) return null

        val answerListNode = ListNode(mutableList[0])
        tempListNode = null

        for (index in 1 until mutableList.count()) {

            val nowListNode = ListNode(mutableList[index])

            if (index == 1) {

                answerListNode.next = nowListNode
            } else {

                tempListNode!!.next = nowListNode
            }

            tempListNode = nowListNode
        }

        return answerListNode
    }
}