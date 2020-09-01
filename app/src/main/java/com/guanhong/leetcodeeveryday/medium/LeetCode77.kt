package com.guanhong.leetcodeeveryday.medium

class LeetCode77 {

    private val answer = mutableListOf<List<Int>>()

    fun combine(n : Int, k : Int) : List<List<Int>> {

        val list = mutableListOf<Int>()

        (1..n).forEach {

            list.add(it)
        }

        helper(list, mutableListOf(), k)

        return answer
    }

    fun helper(list : MutableList<Int>, targetList : MutableList<Int>, count : Int) {

        if (targetList.count() == count) {

            answer.add(targetList.map { it })
            return
        }

        list.forEachIndexed { index, int ->

            val subList = list.subList(index + 1, list.count())

            val newTargetList = mutableListOf<Int>()

            targetList.mapTo(newTargetList) { it }

            newTargetList.add(int)

            helper(subList, newTargetList, count)
        }
    }
}