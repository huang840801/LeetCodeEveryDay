package com.guanhong.leetcodeeveryday

class LeetCode205 {

    fun isIsomorphic(s : String, t : String) : Boolean {

        val mutableMap = mutableMapOf<Char, Char>()
        val mutableMap1 = mutableMapOf<Char, Char>()

        for (index in 0 until s.count()) {

            if (mutableMap[s[index]] == null) {

                mutableMap[s[index]] = t[index]
            } else {

                if (mutableMap[s[index]] != t[index]) {

                    return false
                }
            }

            if (mutableMap1[t[index]] == null) {

                mutableMap1[t[index]] = s[index]
            } else {

                if (mutableMap1[t[index]] != s[index]) {

                    return false
                }
            }
        }

        return true
    }
}