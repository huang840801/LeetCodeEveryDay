package com.guanhong.leetcodeeveryday.easy

class LeetCode784 {

    fun letterCasePermutation(S : String) : List<String> {

        val ans = mutableListOf<String>()

        cal(ans, S.toCharArray().toMutableList(), 0)

        return ans
    }

    fun cal(ans : MutableList<String>, charList : MutableList<Char>, index : Int) {

        if (index == charList.size) {

            ans.add(String(charList.toCharArray()))
            return
        } else {

            if (charList[index].isLetter()) {

                charList[index] = charList[index].toUpperCase()
                cal(ans, charList, index + 1)
                charList[index] = charList[index].toLowerCase()
            }

            cal(ans, charList, index + 1)
        }
    }
}