package com.guanhong.leetcodeeveryday.easy

class LeetCode917 {

    fun reverseOnlyLetters(S : String) : String {

        val charArray = S.toCharArray()

        var start = 0
        var end = charArray.lastIndex

        while (start <= end) {

            if (isLetter(charArray[start]) && isLetter(charArray[end])) {

                swap(charArray, start, end)
                start++
                end--
            } else {

                if (!isLetter(charArray[start])) start++

                if (!isLetter(charArray[end])) end--
            }
        }

        return String(charArray)
    }

    private fun isLetter(char : Char) : Boolean {

        return char.toInt() in 65..90 || char.toInt() in 97..122
    }

    private fun swap(charArray : CharArray, start : Int, end : Int) {

        val temp = charArray[start]
        charArray[start] = charArray[end]
        charArray[end] = temp
    }
}