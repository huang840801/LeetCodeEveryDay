package com.guanhong.leetcodeeveryday

class LeetCode884 {

    fun uncommonFromSentences(A : String, B : String) : Array<String> {

        val map = mutableMapOf<String, Int>()
        val list = ("$A $B").split(" ")

        list.forEach {

            if (map[it] == null) {

                map[it] = 1
            } else {

                map[it] = map[it]!! + 1
            }
        }

        return map.mapTo(mutableListOf()) {

            if (it.value == 1) {
                it.key
            } else {

                ""
            }
        }.filter { it != "" }.toTypedArray()
    }
}