package com.guanhong.leetcodeeveryday

class LeetCode876 {

    fun middleNode(head : ListNode?) : ListNode? {

        val mutableList = mutableListOf<ListNode>()
        var nodeTemp = head

        while (nodeTemp != null) {

            mutableList.add(nodeTemp)
            nodeTemp = nodeTemp.next
        }

        return mutableList[mutableList.count() / 2]
    }
}