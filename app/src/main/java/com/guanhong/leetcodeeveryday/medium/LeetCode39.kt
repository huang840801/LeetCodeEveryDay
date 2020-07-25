package com.guanhong.leetcodeeveryday.medium

class LeetCode39 {

    private lateinit var candidates : IntArray

    val answer = mutableSetOf<List<Int>>()
    var min = 0

    fun combinationSum(candidates : IntArray, target : Int) : List<List<Int>> {

        this.candidates = candidates

        min = candidates.min()!!


        candidates.forEach {

            val list = mutableListOf(it)

            helper(list, target - it)
        }

        return answer.toList()
    }

    fun helper(list : List<Int>, target : Int) {

        when {
            target == 0 -> {

                answer.add(list.sorted())

                return
            }
            target < min -> return

            else -> {

                candidates.forEach {

                    val list1 = list.toMutableList()
                    list1.add(it)

                    helper(list1, target - it)
                }
            }
        }
    }
}