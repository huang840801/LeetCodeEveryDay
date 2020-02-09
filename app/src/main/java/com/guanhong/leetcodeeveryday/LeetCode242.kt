package com.guanhong.leetcodeeveryday

class LeetCode242 {

    fun isAnagram(s : String, t : String) : Boolean {

        if (s.count() != t.count()) return false

        var tempS = s

        t.forEach {

            if (tempS.contains(it)) {

                val indexOf = tempS.indexOf(it)

                tempS = tempS.removeRange(indexOf, indexOf + 1)
            }
        }
        return tempS == ""
    }
}