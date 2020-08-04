package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode141 {

    fun hasCycle(head : ListNode?) : Boolean {

        if (head == null) {
            return false
        }

        var slowRunner : ListNode? = head
        var fastRunner : ListNode? = head.next

        while (slowRunner != null && fastRunner != null) {

            if (slowRunner == fastRunner) {

                return true
            }

            slowRunner = slowRunner.next
            fastRunner = fastRunner.next?.next
        }

        return false
    }
}