package com.guanhong.leetcodeeveryday

class LeetCode938 {

    var answer = 0

    fun rangeSumBST(root : TreeNode?, L : Int, R : Int) : Int {

        cal(root, L, R)
        return answer
    }

    fun cal(treeNode : TreeNode?, L : Int, R : Int) {

        if (treeNode == null) return

        if (treeNode.`val` in L..R) {

            println(" num " + treeNode.`val`)

            answer += treeNode.`val`
        }

        cal(treeNode.right, L, R)
        cal(treeNode.left, L, R)
    }
}