package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode107 {

    val answer = mutableListOf<MutableList<Int>>()

    fun levelOrderBottom(root : TreeNode?) : List<List<Int>> {

        cal(root, 0)

        return answer.reversed()
    }

    fun cal(root : TreeNode?, level : Int) {

        if (root != null) {

            if (level + 1 > answer.count()) {

                answer.add(mutableListOf())
            }

            cal(root.left, level + 1)
            cal(root.right, level + 1)

            answer[level].add(root.`val`)
        }
    }
}