package com.guanhong.leetcodeeveryday.medium

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode199 {

    private val levelMap = mutableMapOf<Int, MutableList<Int>>()

    fun rightSideView(root : TreeNode?) : List<Int> {

        helper(root, 1)

        val answer = mutableListOf<Int>()

        levelMap.forEach {

            answer.add(it.value.last())
        }

        return answer
    }

    fun helper(root : TreeNode?, level : Int) {

        if (root == null) {

            return
        } else {

            if (levelMap[level] == null) {

                levelMap[level] = mutableListOf(root.`val`)
            } else {

                levelMap[level]!!.add(root.`val`)
            }

            helper(root.left, level + 1)
            helper(root.right, level + 1)
        }
    }
}