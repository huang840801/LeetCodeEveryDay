package com.guanhong.leetcodeeveryday

class LeetCode1290 {

    fun getDecimalValue(head : ListNode?) : Int {

        val mutableList = mutableListOf<Int>()

        var listNodeTemp = head

        while (listNodeTemp != null) {

            mutableList.add(0, listNodeTemp.`val`)

            listNodeTemp = listNodeTemp.next
        }

        var answer = 0

        mutableList.forEachIndexed { index, int ->

            var temp = 1

            for (power in 0 until index) {

                temp *= 2
            }

            answer += int * temp
        }

        return answer
    }
}