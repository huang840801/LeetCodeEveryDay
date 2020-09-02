package com.guanhong.leetcodeeveryday.medium

class LeetCode78 {

    private val answer = mutableListOf<List<Int>>()

    fun subsets(nums : IntArray) : List<List<Int>> {

        (0..nums.count()).forEach {

            helper(it, listOf(), nums.toList())
        }

        return answer
    }

    fun helper(count : Int, targetList : List<Int>, list : List<Int>) {

        if (targetList.count() == count) {

            answer.add(targetList)
        } else {

            val listCount = list.count()

            list.forEachIndexed { index, int ->

                val newList = targetList.map { it }.toMutableList()
                newList.add(int)

                val subList = list.subList(index + 1, listCount)
                helper(count, newList, subList)
            }
        }
    }
}