package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode129 {

    var answer = 0

    fun sumNumbers(root : TreeNode?) : Int {

        if (root == null) {
            return 0
        }

        helper(root, StringBuilder())

        return answer
    }

    private fun helper(root : TreeNode, stringBuilder : StringBuilder) {

        stringBuilder.append(root.`val`)

        if (root.left == null && root.right == null) {

            answer += String(stringBuilder).toInt()
        } else {

            if (root.left != null) {

                val newStringBuilder = StringBuilder(stringBuilder)
                helper(root.left!!, newStringBuilder)
            }
            if (root.right != null) {
                val newStringBuilder = StringBuilder(stringBuilder)

                helper(root.right!!, newStringBuilder)
            }
        }
    }
}