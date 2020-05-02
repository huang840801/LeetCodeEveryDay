package com.guanhong.leetcodeeveryday

import kotlin.math.min

class LeetCode1002 {

    fun commonChars(A : Array<String>) : List<String> {

        val array = IntArray(26) { Integer.MAX_VALUE }
        val answer = mutableListOf<String>()

        A.forEach { str ->

            val m = IntArray(26)

            str.forEach { ch ->

                m[ch - 'a']++
            }
            for (i in m.indices) {

                array[i] = min(m[i], array[i])
            }
        }

        array.forEachIndexed { index, count ->

            if (count > 0) {

                for (index1 in 1..count) {

                    answer.add("${('a' + index)}")
                }
            }
        }

        return answer
    }
}