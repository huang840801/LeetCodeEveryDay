package com.guanhong.leetcodeeveryday.easy

import java.lang.StringBuilder

class LeetCode1417 {

    fun reformat(s : String) : String {

        val numList = mutableListOf<Char>()
        val letterList = mutableListOf<Char>()

        s.forEach {

            when (it.toInt()) {
                in 97..122 -> letterList.add(it)
                in 48..57 -> numList.add(it)
            }
        }

        val maxList : MutableList<Char>
        val minList : MutableList<Char>

        if (letterList.count() > numList.count()) {

            maxList = letterList
            minList = numList
        } else {

            maxList = numList
            minList = letterList
        }

        if (maxList.count() - minList.count() > 1) return ""

        val stringBuilder = StringBuilder()

        val count = minList.count()

        maxList.forEachIndexed { index, char ->

            stringBuilder.append(char)

            if (index < count) {
                stringBuilder.append(minList[index])
            }
        }

        return String(stringBuilder)
    }
}