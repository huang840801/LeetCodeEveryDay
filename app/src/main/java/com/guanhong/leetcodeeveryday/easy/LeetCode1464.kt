package com.guanhong.leetcodeeveryday.easy

class LeetCode1464 {

    fun maxProduct(nums : IntArray) : Int {

        val maxIndex = nums.indexOf(nums.max()!!)

        val max = nums[maxIndex]

        nums[maxIndex] = 0

        val secondMaxIndex = nums.indexOf(nums.max()!!)

        val secondMax = nums[secondMaxIndex]

        return (max - 1) * (secondMax - 1)
    }
}