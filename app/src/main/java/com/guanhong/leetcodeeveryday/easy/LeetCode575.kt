package com.guanhong.leetcodeeveryday.easy

class LeetCode575 {

    fun distributeCandies(candies : IntArray) : Int {

        val set = mutableSetOf<Int>()

        candies.forEach {

            set.add(it)
        }

        return if (set.count() <= candies.count() / 2) {

            set.count()
        } else {

            candies.count() / 2
        }
    }
}