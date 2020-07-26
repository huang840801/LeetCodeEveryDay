package com.guanhong.leetcodeeveryday.medium

class LeetCode40 {

    val answer = mutableSetOf<List<Int>>()

    fun combinationSum2(candidates : IntArray, target : Int) : List<List<Int>> {

        val sortedCandidates = candidates.sorted()

        helper(sortedCandidates, mutableListOf(), target)

        return answer.toList()
    }

    fun helper(candidates : List<Int>, answerList : List<Int>, target : Int) {

        if (target == 0) {

            answer.add(answerList.sorted())

            return
        }

        if (candidates.isEmpty() || target < candidates.min()!!) {

            return
        }

        candidates.forEach {

            val list = candidates.toMutableList()
            list.remove(it)

            val mutableAnswerList = answerList.toMutableList()
            mutableAnswerList.add(it)

            helper(list, mutableAnswerList, target - it)
        }
    }
}