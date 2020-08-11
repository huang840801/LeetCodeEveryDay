package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode226 {

    fun invertTree(root : TreeNode?) : TreeNode? {

        if (root == null) return null

        val temp = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(temp)

        return root
    }
}