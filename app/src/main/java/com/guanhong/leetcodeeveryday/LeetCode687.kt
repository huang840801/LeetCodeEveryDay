package com.guanhong.leetcodeeveryday

import kotlin.math.max

class LeetCode687 {

    var answer = 0

    fun longestUnivaluePath(root : TreeNode?) : Int {

        if (root == null) return 0

        getMaxLength(root, root.`val`)

        return answer
    }

    fun getMaxLength(treeNode : TreeNode?, num: Int) : Int {

        if (treeNode == null) return 0

        val left = getMaxLength(treeNode.left, treeNode.`val`)
        val right = getMaxLength(treeNode.right, treeNode.`val`)

        answer = max(answer, left + right)

        if (num == treeNode.`val`) return max(left, right) + 1

        return 0
    }
}