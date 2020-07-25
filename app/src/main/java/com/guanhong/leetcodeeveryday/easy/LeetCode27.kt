package com.guanhong.leetcodeeveryday.easy

class LeetCode27 {

    fun removeElement(nums : IntArray, `val` : Int) : Int {

        var index = 0

        nums.forEach {

            if (it != `val`) {

                nums[index] = it

                index++
            }
        }

        return index
    }
}