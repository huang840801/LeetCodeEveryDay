package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode83 {

    fun deleteDuplicates(head : ListNode?) : ListNode? {

        if (head == null) return null

        var nowInt = head.`val`

        var headCursor = head

        val mutableList = mutableListOf(nowInt)

        while (headCursor!!.next != null) {

            if (nowInt != headCursor.next!!.`val`) {

                nowInt = headCursor.next!!.`val`

                mutableList.add(headCursor.next!!.`val`)
            }
            headCursor = headCursor.next
        }

        val answerListNode = ListNode(head.`val`)

        var answerCursor : ListNode? = null

        for (index in 1 until mutableList.count()) {

            val nowListNode = ListNode(mutableList[index])

            if (index == 1) {

                answerListNode.next = nowListNode

            } else{

                answerCursor!!.next = nowListNode
            }
            answerCursor = nowListNode
        }

        return answerListNode
    }
}