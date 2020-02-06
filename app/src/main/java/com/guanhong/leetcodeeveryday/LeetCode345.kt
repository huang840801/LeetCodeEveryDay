package com.guanhong.leetcodeeveryday

class LeetCode345 {

    fun reverseVowels(s : String) : String {

        val charList = mutableListOf<Char>()

        s.forEach {

            charList.add(it)
        }

        var leftIndex = 0
        var rightIndex = charList.lastIndex

        val vowelList = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        var leftVowelIndex = -1

        var rightVowelIndex = -1

        while (leftIndex < rightIndex) {

            if (leftVowelIndex == -1 && vowelList.any { it == charList[leftIndex] }) {

                leftVowelIndex = leftIndex
            }

            if (leftVowelIndex == -1) {

                leftIndex++
            }
            if (rightVowelIndex == -1 && vowelList.any { it == charList[rightIndex] }) {

                rightVowelIndex = rightIndex
            }

            if (rightVowelIndex == -1) {

                rightIndex--
            }
            if (leftVowelIndex != -1 && rightVowelIndex != -1) {

                val tempVowel = charList[leftVowelIndex]
                charList[leftVowelIndex] = charList[rightVowelIndex]
                charList[rightVowelIndex] = tempVowel

                leftVowelIndex = -1
                rightVowelIndex = -1

                leftIndex++
                rightIndex--
            }
        }

        var answer = ""

        charList.forEach {

            answer += it.toString()
        }

        return answer
    }
}