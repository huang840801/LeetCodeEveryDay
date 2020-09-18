package com.guanhong.leetcodeeveryday.medium

class LeetCode179 {

    fun largestNumber(nums : IntArray) : String {

        val list = nums.map { it.toString() }

        val comparator = Comparator<String> { o1, o2 ->

            val s1 = o1 + o2
            val s2 = o2 + o1

            s2.compareTo(s1)
        }

        val sortedWith = list.sortedWith(comparator)

        if (sortedWith[0] == "0") {

            return "0"
        }

        val stringBuilder = StringBuilder()

        sortedWith.forEach {

            stringBuilder.append(it)
        }

        return String(stringBuilder)
    }
}