package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.ListNode

class LeetCode234 {

    fun isPalindrome(head : ListNode?) : Boolean {

        val list = mutableListOf<Int>()

        var temp = head

        while (temp != null) {

            list.add(temp.`val`)
            temp = temp.next
        }

        return list == list.reversed()
    }
}