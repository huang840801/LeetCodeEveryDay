package com.guanhong.leetcodeeveryday

class LeetCode1128 {

    fun numEquivDominoPairs(dominoes : Array<IntArray>) : Int {

        val map = mutableMapOf<Pair<Int, Int>, Int>()

        dominoes.forEach {

            val bigger : Int
            val smaller : Int

            if (it[0] > it[1]) {

                bigger = it[0]
                smaller = it[1]
            } else {

                bigger = it[1]
                smaller = it[0]
            }

            if (map[Pair(smaller, bigger)] == null) {

                map[Pair(smaller, bigger)] = 1
            } else {

                map[Pair(smaller, bigger)] = map[Pair(smaller, bigger)]!! + 1
            }
        }

        var answer = 0

        map.forEach {

            val time = it.value

            if (time > 1) {

                answer += time * (time - 1) / 2
            }
        }

        return answer
    }
}