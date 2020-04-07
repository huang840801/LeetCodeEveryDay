package com.guanhong.leetcodeeveryday

class LeetCode844 {

    fun backspaceCompare(S : String, T : String) : Boolean {

        var newS = ""
        var newT = ""

        S.forEach {

            if (it != '#') {

                newS += it
            } else {

                if (newS.isNotEmpty()) {

                    newS = newS.removeRange(newS.length - 1, newS.length)
                }
            }
        }
        T.forEach {

            if (it != '#') {

                newT += it
            } else {

                if (newT.isNotEmpty()) {

                    newT = newT.removeRange(newT.length - 1, newT.length)
                }
            }
        }

        return newS == newT
    }
}