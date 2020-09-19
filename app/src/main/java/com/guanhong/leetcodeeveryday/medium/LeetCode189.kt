package com.guanhong.leetcodeeveryday.medium

class LeetCode189 {

    fun findRepeatedDnaSequences(s : String) : List<String> {

        if (s.count() < 10) {

            return listOf()
        }
        val map = mutableMapOf<String, Int>()

        var temp = s.substring(0..9)

        for (index in 9..s.lastIndex) {

            if (map[temp] == null) {

                map[temp] = 1
            } else {

                map[temp] = map[temp]!! + 1
            }

            if (index != s.lastIndex) {

                temp = temp.substring(1..9)
                temp += s[index + 1]
            }
        }

        val answer = mutableListOf<String>()

        map.forEach {

            if (it.value > 1) {

                answer.add(it.key)
            }
        }

        return answer
    }
}