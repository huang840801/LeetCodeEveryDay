package com.guanhong.leetcodeeveryday

class LeetCode1431 {

    fun kidsWithCandies(candies : IntArray, extraCandies : Int) : BooleanArray {

        val maxCandies = candies.max()!!

        val answer = BooleanArray(candies.count())

        candies.forEachIndexed { index, candy ->

            answer[index] = candy + extraCandies >= maxCandies
        }

        return answer
    }
}