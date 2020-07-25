package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode
import kotlin.math.min

class LeetCode111 {

    fun minDepth(root : TreeNode?) : Int {

        if (root == null) return 0
        if (root.left == null) return minDepth(root.right) + 1
        if (root.right == null) return minDepth(root.left) + 1

        return min(minDepth(root.left), minDepth(root.right)) + 1
    }
}