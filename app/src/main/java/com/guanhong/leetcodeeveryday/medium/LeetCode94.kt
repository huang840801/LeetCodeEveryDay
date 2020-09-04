package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode94 {

    fun inorderTraversal(root : TreeNode?) : List<Int> {

        if (root == null) {
            return listOf()
        }

        val list = mutableListOf<Int>()
        helper(root, list)

        return list
    }

    fun helper(root : TreeNode, list : MutableList<Int>) {

        if (root.left != null) {

            helper(root.left!!, list)
        }
        list.add(root.`val`)
        if (root.right != null) {

            helper(root.right!!, list)
        }
    }
}