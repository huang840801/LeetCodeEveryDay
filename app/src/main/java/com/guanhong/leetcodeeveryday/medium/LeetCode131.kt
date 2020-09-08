package com.guanhong.leetcodeeveryday.medium

class LeetCode131 {

    private val answer : MutableList<List<String>> = mutableListOf()

    fun partition(s : String) : List<List<String>> {

        if (s.isEmpty()) {

            return listOf(listOf())
        }

        for (count in 0 until s.lastIndex) {

            val substring = s.substring(0..count)

            if (isPalindrome(substring)) {

                helper(listOf(substring), s.substring((count + 1)..s.lastIndex))
            }
        }

        if (isPalindrome(s)) {

            answer.add(listOf(s))
        }

        return answer
    }

    private fun helper(list : List<String>, s : String) {

        if (isPalindrome(s)) {

            val toMutableList = list.map { it }.toMutableList()
            toMutableList.add(s)

            answer.add(toMutableList)
        }

        for (count in 0 until s.lastIndex) {

            val substring = s.substring(0..count)

            if (isPalindrome(substring)) {

                val toMutableList = list.map { it }.toMutableList()
                toMutableList.add(substring)

                helper(toMutableList, s.substring((count + 1)..s.lastIndex))
            }
        }
    }

    private fun isPalindrome(s : String) : Boolean {

        return s == s.reversed()
    }
}