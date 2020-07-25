package com.guanhong.leetcodeeveryday.medium

class LeetCode22 {

    val list = mutableListOf<String>()
    var max = 0

    fun generateParenthesis(n : Int) : List<String> {

        max = n
        backtrack("", 0, 0)
        return list
    }

    fun backtrack(str : String, open : Int, close : Int) {

        if (str.length == max * 2) {

            list.add(str)

            return
        }

        if (open < max) {

            backtrack("$str(", open + 1, close)
        }
        if (close < open) {

            backtrack("$str)", open, close + 1)
        }
    }
}