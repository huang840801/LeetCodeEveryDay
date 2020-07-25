package com.guanhong.leetcodeeveryday.easy

class LeetCode1455 {

    fun isPrefixOfWord(sentence : String, searchWord : String) : Int {

        val splitList = sentence.split(" ")

        splitList.forEachIndexed { index, string ->

            if (string.startsWith(searchWord)) {

                return index + 1
            }
        }

        return -1
    }
}