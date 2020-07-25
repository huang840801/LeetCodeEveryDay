package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode108 {

    fun sortedArrayToBST(nums : IntArray) : TreeNode? {

        if (nums.isEmpty()) {

            return null
        }

        return helper(nums, 0, nums.lastIndex)
    }

    private fun helper(nums : IntArray, start : Int, end : Int) : TreeNode? {

        if (start > end) {

            return null
        }

        val middle = (start + end) / 2

        val treeNode = TreeNode(nums[middle])

        treeNode.left = helper(nums, start, middle - 1)
        treeNode.right = helper(nums, middle + 1, end)

        return treeNode
    }
}