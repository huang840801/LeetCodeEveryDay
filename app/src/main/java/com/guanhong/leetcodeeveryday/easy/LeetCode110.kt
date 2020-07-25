package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode
import kotlin.math.abs
import kotlin.math.max

class LeetCode110 {

    fun isBalanced(root : TreeNode?) : Boolean {

        if (root == null) {
            return true
        }

        return abs(getHeight(root.left) - getHeight(root.right)) <= 1 && isBalanced(root.left) && isBalanced(
            root.right
        )
    }

    fun getHeight(root : TreeNode?) : Int {

        return if (root == null) {

            0
        } else {

            val leftHeight = getHeight(root.left)
            val rightHeight = getHeight(root.right)

            max(leftHeight, rightHeight) + 1
        }
    }
}