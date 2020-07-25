package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode897 {

    fun increasingBST(root : TreeNode?) : TreeNode? {

        if (root!!.left == null && root.right == null) return TreeNode(
            root.`val`
        )

        val mutableList = mutableListOf<Int>()

        getTreeNodeValue(root, mutableList)

        val sortMutableList = mutableList.sorted().toMutableList()

        return cal(TreeNode(sortMutableList[0]), sortMutableList, 1)
    }

    private fun cal(treeNode : TreeNode, mutableList : MutableList<Int>, index : Int) : TreeNode {

        if (index == mutableList.lastIndex) {

            treeNode.left = null
            treeNode.right = TreeNode(mutableList[index])
        } else {

            treeNode.left = null
            treeNode.right = cal(TreeNode(mutableList[index]), mutableList, index + 1)
        }

        return treeNode
    }

    private fun getTreeNodeValue(treeNode : TreeNode?, mutableList : MutableList<Int>) {

        if (treeNode != null) {

            mutableList.add(treeNode.`val`)

            getTreeNodeValue(treeNode.left, mutableList)
            getTreeNodeValue(treeNode.right, mutableList)
        }
    }
}