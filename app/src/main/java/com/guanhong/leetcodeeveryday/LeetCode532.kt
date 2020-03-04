package com.guanhong.leetcodeeveryday

class LeetCode532 {

    fun findPairs(nums : IntArray, k : Int) : Int {

        val mutableMapOf = mutableMapOf<Int, Int>()
        var answer = 0

        if (k == 0) {

            nums.forEach {

                if (mutableMapOf[it] == null) {

                    mutableMapOf[it] = 1
                } else {

                    mutableMapOf[it] = mutableMapOf[it]!! + 1
                }
            }

            mutableMapOf.forEach {

                if (it.value > 1) {

                    answer++
                }
            }
        } else {

            val numSet = nums.toSortedSet()

            numSet.forEach {

                if (mutableMapOf.containsKey(it - k)) {

                    answer++
                }

                mutableMapOf[it] = it
            }
        }

        return answer
    }
}