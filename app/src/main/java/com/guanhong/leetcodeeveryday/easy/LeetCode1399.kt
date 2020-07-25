package com.guanhong.leetcodeeveryday.easy

class LeetCode1399 {

    fun countLargestGroup(n : Int) : Int {

        val map = mutableMapOf<Int, MutableList<Int>>()

        (1..n).forEach {

            val groupNum = getGroupNum(it)

            if (map[groupNum] == null) {

                map[groupNum] = mutableListOf(it)
            } else {

                map[groupNum]!!.add(it)
            }
        }

        var maxCount = 0
        var answer = 0

        map.forEach {

            val count = it.value.count()

            if (count > maxCount) {

                maxCount = count
            }
        }

        map.forEach {

            val count = it.value.count()

            if (count == maxCount) {

                answer++
            }
        }

        return answer
    }

    private fun getGroupNum(num : Int) : Int {

        return if (num < 10) {

            num
        } else {

            num % 10 + getGroupNum(num / 10)
        }
    }
}