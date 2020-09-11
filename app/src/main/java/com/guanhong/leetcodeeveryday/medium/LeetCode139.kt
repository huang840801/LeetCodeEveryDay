package com.guanhong.leetcodeeveryday.medium

class LeetCode139 {

    fun wordBreak(s : String, wordDict : List<String>) : Boolean {

        if (wordDict.contains(s)) {

            return true
        }

        if (s.replace("/", "").isEmpty()) {

            return true
        }

        wordDict.forEach {

            if (s.contains(it)) {

                if (wordBreak(s.replaceFirst(it, "/"), wordDict)) {

                    return true
                }
            }
        }

        return false
    }
}