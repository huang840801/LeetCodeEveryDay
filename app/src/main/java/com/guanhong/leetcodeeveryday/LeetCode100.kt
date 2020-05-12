package com.guanhong.leetcodeeveryday

class LeetCode100 {

    fun isSameTree(p : TreeNode?, q : TreeNode?) : Boolean {

        val listP = mutableListOf<Int?>()
        val listQ = mutableListOf<Int?>()

        cal(p, listP)
        cal(q, listQ)

        if (listP.count() != listQ.count()) return false

        for (index in 0 until listP.count()) {

            if (listP[index] != listQ[index]) {

                return false
            }
        }

        return true
    }

    fun cal(treeNode : TreeNode?, list : MutableList<Int?>) {

        if (treeNode != null) {

            list.add(treeNode.`val`)

            cal(treeNode.left, list)
            cal(treeNode.right, list)
        } else {

            list.add(null)
        }
    }
}