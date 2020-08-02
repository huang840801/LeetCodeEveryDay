package com.guanhong.leetcodeeveryday.medium

class LeetCode46 {

    fun permute(nums : IntArray) : List<List<Int>> {

        val list = mutableListOf<List<Int>>()

        backtrack(list, ArrayList(), nums)

        return list
    }

    private fun backtrack(
        list : MutableList<List<Int>>,
        tempList : MutableList<Int>,
        nums : IntArray
    ) {
        if (tempList.size == nums.size) {

            list.add(ArrayList(tempList))
        } else {

            for (i in nums.indices) {

                if (tempList.contains(nums[i])) continue // element already exists, skip

                tempList.add(nums[i])

                backtrack(list, tempList, nums)

                tempList.removeAt(tempList.size - 1)
            }
        }
    }
}