package com.guanhong.leetcodeeveryday.easy

import java.lang.StringBuilder

class LeetCode1309 {

    fun freqAlphabets(s : String) : String {

        val lastSharpIndex = s.indexOfLast { it == '#' }

        var index = 0

        val stringBuilder = StringBuilder()

        while (index < lastSharpIndex - 2) {

            if (s[index + 2] == '#') {

                stringBuilder.append(getAlphabet(s.substring(index until index + 2)))

                index += 3
            } else {

                stringBuilder.append(getAlphabet(s[index].toString()))

                index += 1
            }
        }

        stringBuilder.append(getAlphabet(s.substring(lastSharpIndex - 2 until lastSharpIndex)))

        index = lastSharpIndex

        while (index < s.count()) {

            stringBuilder.append(getAlphabet(s[index].toString()))

            index += 1
        }

        return String(stringBuilder)
    }

    private fun getAlphabet(char : String) : String {

        return when (char) {
            "1" -> "a"
            "2" -> "b"
            "3" -> "c"
            "4" -> "d"
            "5" -> "e"
            "6" -> "f"
            "7" -> "g"
            "8" -> "h"
            "9" -> "i"
            "10" -> "j"
            "11" -> "k"
            "12" -> "l"
            "13" -> "m"
            "14" -> "n"
            "15" -> "o"
            "16" -> "p"
            "17" -> "q"
            "18" -> "r"
            "19" -> "s"
            "20" -> "t"
            "21" -> "u"
            "22" -> "v"
            "23" -> "w"
            "24" -> "x"
            "25" -> "y"
            "26" -> "z"
            else -> ""
        }
    }
}