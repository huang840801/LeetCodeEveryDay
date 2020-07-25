package com.guanhong.leetcodeeveryday.easy

class LeetCode1408 {

    fun stringMatching(words : Array<String>) : List<String> {

        val list = mutableListOf<String>()

        var temp : String

        words.forEachIndexed { index, word ->

            temp = word

            words[index] = ""

            if (words.firstOrNull { it.contains(word) } != null) {

                list.add(word)
            }

            words[index] = temp
        }

        return list
    }
}