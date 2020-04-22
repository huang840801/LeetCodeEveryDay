package com.guanhong.leetcodeeveryday

class LeetCode942 {

    fun diStringMatch(S : String) : IntArray {

        val count = S.count()

        var left = 0
        var right = count

        val intArray = IntArray(count + 1)

        for (index in 0 until count) {

            if (S[index] == 'I') {

                intArray[index] = left
                left++
            } else {

                intArray[index] = right
                right--
            }
        }

        intArray[count] = left

        return intArray
    }
}