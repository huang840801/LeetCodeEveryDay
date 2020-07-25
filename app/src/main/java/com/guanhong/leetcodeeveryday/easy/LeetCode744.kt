package com.guanhong.leetcodeeveryday.easy

class LeetCode744 {

    fun nextGreatestLetter(letters : CharArray, target : Char) : Char {

        if (letters[letters.lastIndex].toInt() > target.toInt()) {

            letters.forEach {

                if (it.toInt() > target.toInt()) {

                    return it
                }
            }
        } else {

            return letters[0]
        }

        return ' '
    }
}