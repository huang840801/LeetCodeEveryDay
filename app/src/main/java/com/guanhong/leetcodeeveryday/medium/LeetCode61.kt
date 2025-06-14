package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode61 {
    fun rotateRight(head : ListNode?, k : Int) : ListNode? {
        if (head == null) {
            return null
        }
        var pointerHead = head
        var length = 1
        while (pointerHead!!.next != null) {
            pointerHead = pointerHead.next
            length++
        }
        pointerHead.next = head
        val step = length - k % length

        repeat(step) {
            pointerHead = pointerHead?.next
        }
        val newHead = pointerHead?.next
        pointerHead?.next = null
        return newHead
    }
}