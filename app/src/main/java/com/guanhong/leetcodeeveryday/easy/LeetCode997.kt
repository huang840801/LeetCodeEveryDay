package com.guanhong.leetcodeeveryday.easy

class LeetCode997 {

    fun findJudge(N : Int, trust : Array<IntArray>) : Int {

        val mutableMap = mutableMapOf<Int, MutableList<Int>>()

        for (index in 1..N) {

            mutableMap[index] = mutableListOf()
        }

        trust.forEach {

            mutableMap.remove(it.first())

            if (mutableMap[it[1]] != null) {

                mutableMap[it[1]]!!.add(it.first())
            }
        }

        return if (mutableMap.count() == 1 &&
            mutableMap[mutableMap.keys.first()]!!.count() == N - 1
        ) {

            mutableMap.keys.first()
        } else {

            -1
        }
    }
}