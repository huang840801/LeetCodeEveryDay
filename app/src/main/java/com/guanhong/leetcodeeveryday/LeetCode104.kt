package com.guanhong.leetcodeeveryday

import java.lang.Math.max

class LeetCode104 {

    var maxDepth = 0

    fun maxDepth(root : TreeNode?) : Int {

        cal(root, 0)

        return maxDepth
    }

    private fun cal(root : TreeNode?, depth : Int) {

        if (root == null) {

            maxDepth = max(maxDepth, depth)
        } else {

            cal(root.left, depth + 1)
            cal(root.right, depth + 1)
        }
    }
}