package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode112 {

    private var sum = 0

    fun hasPathSum(root : TreeNode?, sum : Int) : Boolean {

        if (root == null) return false

        this.sum = sum

        return hasPathSumHelper(root, 0)
    }

    fun hasPathSumHelper(root : TreeNode?, sum : Int) : Boolean {

        if (root == null) {

            return this.sum == sum
        } else {

            if (root.left == null) return hasPathSumHelper(root.right, sum + root.`val`)
            if (root.right == null) return hasPathSumHelper(root.left, sum + root.`val`)

            return hasPathSumHelper(root.left, sum + root.`val`) ||
                    hasPathSumHelper(root.right, sum + root.`val`)
        }
    }
}