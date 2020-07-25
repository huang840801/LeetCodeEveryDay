package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode101 {

    fun isSymmetric(root: TreeNode?): Boolean {

        if (root == null) return true

        return cal(root.left, root.right)
    }

    private fun cal(left: TreeNode?, right: TreeNode?): Boolean {

        return if (left != null && right != null) {

            (left.`val` == right.`val`) && cal(left.left, right.right) && cal(left.right, right.left)

        } else {

            left == right
        }
    }
}