package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode143 {

    fun reorderList(head : ListNode?) {

        var temp : ListNode? = head?.next

        val nodeList = mutableListOf<ListNode>()

        while (temp != null) {

            val thisNode = temp

            nodeList.add(thisNode)

            temp = temp.next
        }

        if (nodeList.isEmpty()) {

            return
        }

        var startIndex = 0
        var endIndex = nodeList.lastIndex

        var isAssignNextFromEnd = true

        head!!.next = nodeList.last()

        while (startIndex != endIndex) {

            if (isAssignNextFromEnd) {

                nodeList[endIndex].next = nodeList[startIndex]
                endIndex--
            } else {

                nodeList[startIndex].next = nodeList[endIndex]
                startIndex++
            }
            isAssignNextFromEnd = !isAssignNextFromEnd
        }

        nodeList[startIndex].next = null
    }
}