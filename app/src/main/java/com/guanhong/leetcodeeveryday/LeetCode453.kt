package com.guanhong.leetcodeeveryday

class LeetCode453 {

    fun minMoves(nums : IntArray) : Int {

        val total = nums.sum()
        val min = getMin(nums)
        val count = nums.count()

        var step = 0
        var finalTotal = 0

//        finalTotal = total + (count - 1) * step

//        finalTotal / count = min + step

//        (total + (count - 1) * step) / count = min + step

//        (total + (count - 1) * step)  = min * count + step * count

//        (total + (count  * step - step)  = min * count + step * count

//        (total - step)  = min * count

//        step = total - min * count

        return total - min * count
    }

    fun getMin(intArray : IntArray) : Int {

        if (intArray.count() == 0) {

            return -99
        }

        var answer = intArray[0]

        for (num in intArray) {

            if (num < answer) {

                answer = num
            }
        }

        return answer
    }
}