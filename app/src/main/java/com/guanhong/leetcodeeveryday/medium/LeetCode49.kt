package com.guanhong.leetcodeeveryday.medium

class LeetCode49 {

    fun groupAnagrams(strs : Array<String>) : List<List<String>> {

        val map = mutableMapOf<List<Char>, MutableList<String>>()

        strs.forEach {

            val sortedCharArray = it.toCharArray().sorted()

            if (map[sortedCharArray] == null) {

                map[sortedCharArray] = mutableListOf(it)
            } else {

                map[sortedCharArray]!!.add(it)
            }
        }

        return ArrayList(map.values)
    }
}