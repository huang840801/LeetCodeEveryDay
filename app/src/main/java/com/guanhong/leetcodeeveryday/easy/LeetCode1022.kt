package com.guanhong.leetcodeeveryday.easy

import com.guanhong.leetcodeeveryday.TreeNode

class LeetCode1022 {

    class Solution {

        var answer = 0

        fun sumRootToLeaf(root : TreeNode?) : Int {

            if (root!!.left == null && root.right == null) return root.`val`

            cal(root, "")

            return answer
        }

        private fun binaryToDecimal(binary : String) : Int {

            var time = 1
            var decimal = 0

            for (index in binary.count() - 1 downTo 0) {

                decimal += (time * binary[index].toString().toInt())

                time *= 2
            }

            return decimal
        }

        private fun cal(treeNode : TreeNode, value : String) {

            if (treeNode.left == null && treeNode.right == null) {

                answer += binaryToDecimal(value + treeNode.`val`)
            } else {

                if (treeNode.left != null) {
                    cal(treeNode.left!!, value + treeNode.`val`)
                }
                if (treeNode.right != null) {

                    cal(treeNode.right!!, value + treeNode.`val`)
                }
            }
        }
    }
}