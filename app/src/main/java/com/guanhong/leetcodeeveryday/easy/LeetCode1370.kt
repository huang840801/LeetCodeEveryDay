package com.guanhong.leetcodeeveryday.easy

import java.lang.StringBuilder

class LeetCode1370 {

    fun sortString(s : String) : String {

        val stringBuilder = StringBuilder()

        var string = s

        var isMin = true

        while (string.isNotEmpty()) {

            val sortedList = if (isMin) {

                string.toSet().toMutableSet().sorted()
            } else {

                string.toSet().toMutableSet().sorted().reversed()
            }

            sortedList.forEach {

                stringBuilder.append(it)
                string = string.replaceFirst(it.toString(), "")
            }

            isMin = !isMin
        }

        return String(stringBuilder)
    }
}