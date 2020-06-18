package com.guanhong.leetcodeeveryday

class LeetCode1337 {

    fun kWeakestRows(mat : Array<IntArray>, k : Int) : IntArray {

        val mutableMap = mutableMapOf<Int, Int>()
        val mutableList = mutableListOf<Int>()

        mat.forEachIndexed { index, array ->

            val temp = mutableListOf<Int>()

            array.forEach {

                temp.add(it)
            }

            val sum = temp.sum()

            mutableMap[index] = sum
            mutableList.add(sum)
        }

        val sortedList = mutableList.sorted()

        val answer = IntArray(k)

        loop@ for (index in 0 until k) {

            for (mutableEntry in mutableMap) {

                if (mutableEntry.value == sortedList[index]) {

                    answer[index] = mutableEntry.key

                    mutableMap[mutableEntry.key] = -1

                    continue@loop
                }
            }
        }

        return answer
    }
}