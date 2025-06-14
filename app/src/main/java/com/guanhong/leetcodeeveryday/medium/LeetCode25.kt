package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode25 {
    fun swapPairs(head : ListNode?) : ListNode? {
        if (head == null) return null
        if (head.next == null) return head
        var pointer1 = head
        var pointer2 = head.next
        var temp : Int
        while (pointer1 != null && pointer2 != null) {
            temp = pointer1.`val`
            pointer1.`val` = pointer2.`val`
            pointer2.`val` = temp
            pointer1 = pointer2.next
            pointer2 = pointer1?.next
        }
        return head
    }
}