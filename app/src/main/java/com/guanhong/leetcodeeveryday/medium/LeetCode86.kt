package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode86 {
    fun partition(head : ListNode?, x : Int) : ListNode? {
        if (head == null) {
            return null
        }
        var smallerHead : ListNode? = null
        var biggerHead : ListNode? = null
        var pointerSmallerHead = smallerHead
        var pointerBiggerHead = biggerHead
        var pointerHead = head
        while (pointerHead != null) {
            if (pointerHead.`val` < x) {
                if (smallerHead == null) {
                    smallerHead = ListNode(pointerHead.`val`)
                    pointerSmallerHead = smallerHead
                } else {
                    pointerSmallerHead?.next = ListNode(pointerHead.`val`)
                    pointerSmallerHead = pointerSmallerHead?.next
                }
            } else {
                if (biggerHead == null) {
                    biggerHead = ListNode(pointerHead.`val`)
                    pointerBiggerHead = biggerHead
                } else {
                    pointerBiggerHead?.next = ListNode(pointerHead.`val`)
                    pointerBiggerHead = pointerBiggerHead?.next
                }
            }

            pointerHead = pointerHead.next
        }
        return if (smallerHead == null) {
            biggerHead
        } else {
            pointerSmallerHead?.next = biggerHead
            smallerHead
        }
    }
}