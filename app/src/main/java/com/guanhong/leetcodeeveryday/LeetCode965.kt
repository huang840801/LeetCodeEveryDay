package com.guanhong.leetcodeeveryday

class LeetCode965 {

    fun isUnivalTree(root : TreeNode?) : Boolean {

        if (root == null) return false
        val value = root.`val`

        return cal(root, value)
    }

    fun cal(root : TreeNode?, value : Int) : Boolean {

        return if (root == null) {

            true
        } else {

            if (root.`val` != value) false
            else {

                cal(root.right, value) && cal(root.left, value)
            }
        }
    }
}