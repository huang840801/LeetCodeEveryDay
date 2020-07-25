package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode21 {

    fun mergeTwoLists(l1 : ListNode?, l2 : ListNode?) : ListNode? {

        if (l1 == null && l2 == null) return null

        val mutableList = mutableListOf<Int>()

        var varListNode = l1

        while (varListNode != null) {

            mutableList.add(varListNode.`val`)

            varListNode = varListNode.next
        }

        varListNode = l2

        while (varListNode != null) {

            mutableList.add(varListNode.`val`)

            varListNode = varListNode.next
        }

        mutableList.sort()

        varListNode = ListNode(mutableList[0])
        var tempListNode : ListNode? = null

        for (i in 1 until mutableList.count()) {

            val nowListNode = ListNode(mutableList[i])

            if (i == 1) {

                varListNode.next = nowListNode
            } else {
                tempListNode?.next = nowListNode
            }
            tempListNode = nowListNode
        }

        return varListNode
    }
}