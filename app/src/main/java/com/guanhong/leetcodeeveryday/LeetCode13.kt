package com.guanhong.leetcodeeveryday

class LeetCode13 {

    private val romanNumList = listOf(
        'I',
        'V',
        'X',
        'L',
        'C',
        'D',
        'M'
    )

    fun romanToInt(s : String) : Int {

        var previousChar = 'M'
        var answer = 0

        s.forEach {

            answer += getNum(it)

            if (romanNumList.indexOf(previousChar) < romanNumList.indexOf(it)) {

                answer = answer - getNum(previousChar) - getNum(previousChar)
            }

            previousChar = it
        }

        return answer
    }

    private fun getNum(char : Char) : Int {

        return when (romanNumList.indexOf(char)) {
            0 -> 1
            1 -> 5
            2 -> 10
            3 -> 50
            4 -> 100
            5 -> 500
            6 -> 1000
            else -> 1001
        }
    }
}