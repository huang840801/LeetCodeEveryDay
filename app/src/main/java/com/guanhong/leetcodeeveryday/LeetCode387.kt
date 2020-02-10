package com.guanhong.leetcodeeveryday

class LeetCode387 {

    fun firstUniqChar(s : String) : Int {

        val mutableMap = mutableMapOf<Char, Int>()

        s.forEach { char ->

            if (mutableMap.containsKey(char)) {

                mutableMap[char] = mutableMap[char]!! + 1
            } else {

                mutableMap[char] = 1
            }
        }

        mutableMap.forEach {

            if (it.value == 1) {

                return s.indexOf(it.key)
            }
        }

        return -1
    }
}