package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode257 {

    private val answer = mutableListOf<String>()

    fun binaryTreePaths(root : TreeNode?) : List<String> {

        if (root == null) {
            return listOf()
        }

        helper(root, mutableListOf())

        return answer
    }

    fun helper(treeNode : TreeNode, list : MutableList<String>) {

        list.add("${treeNode.`val`}")

        if (treeNode.right == null && treeNode.left == null) {

            var paths = ""

            list.forEachIndexed { index, s ->

                paths += if (index == 0) {

                    s
                } else {

                    "->$s"
                }
            }

            answer.add(paths)
        } else {

            if (treeNode.right != null) {

                val newList = mutableListOf<String>()

                list.mapTo(newList) { it }

                helper(treeNode.right!!, newList)
            }

            if (treeNode.left != null) {

                val newList = mutableListOf<String>()

                list.mapTo(newList) { it }

                helper(treeNode.left!!, newList)
            }
        }
    }
}