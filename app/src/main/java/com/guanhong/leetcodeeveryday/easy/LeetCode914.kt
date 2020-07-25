package com.guanhong.leetcodeeveryday.easy

class LeetCode914 {

    fun hasGroupsSizeX(deck : IntArray) : Boolean {

        val mutableMap = mutableMapOf<Int, Int>()

        deck.forEach {

            if (mutableMap[it] == null) {

                mutableMap[it] = 1
            } else {

                mutableMap[it] = mutableMap[it]!! + 1
            }
        }

        val mutableList = mutableListOf<Int>()

        mutableMap.forEach {

            mutableList.add(it.value)
        }

        val min = mutableList.min()!!

        for (i in 2..min) {

            if (mutableList.all { it % i == 0 }) {

                return true
            }
        }

        return false
    }
}