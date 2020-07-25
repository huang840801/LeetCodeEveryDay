package com.guanhong.leetcodeeveryday.easy

import java.lang.Exception

class LeetCode500 {

    fun findWords(words : Array<String>) : Array<String> {

        val answer = mutableListOf<String>()

        val row1List = listOf(
            'q',
            'w',
            'e',
            'r',
            't',
            'y',
            'u',
            'i',
            'o',
            'p',
            'Q',
            'W',
            'E',
            'R',
            'T',
            'Y',
            'U',
            'I',
            'O',
            'P'
        )
        val row2List = listOf(
            'a',
            's',
            'd',
            'f',
            'g',
            'h',
            'j',
            'k',
            'l',
            'A',
            'S',
            'D',
            'F',
            'G',
            'H',
            'J',
            'K',
            'L'
        )
        val row3List = listOf('z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M')

        words.forEach { word ->

            if (word.isNotEmpty()) {

                val row = when {
                    row1List.contains(word[0]) -> row1List
                    row2List.contains(word[0]) -> row2List
                    row3List.contains(word[0]) -> row3List
                    else -> throw Exception()
                }

                word.forEachIndexed { index, char ->

                    if (!row.contains(char)) {

                        return@forEach
                    }

                    if (index == word.lastIndex) {

                        answer.add(word)
                    }
                }
            }
        }

        return answer.toTypedArray()
    }
}