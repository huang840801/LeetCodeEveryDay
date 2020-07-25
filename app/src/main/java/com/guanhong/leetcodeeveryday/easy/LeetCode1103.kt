package com.guanhong.leetcodeeveryday.easy

class LeetCode1103 {

    fun distributeCandies(candies : Int, num_people : Int) : IntArray {

        val peopleArray = IntArray(num_people)

        var candies1 = candies

        var candyToGive = 1

        var peopleIndex = 0

        while (candies1 > 0) {

            if (candies1 < candyToGive) {

                peopleArray[peopleIndex] += candies1

                candies1 = 0
            } else {

                candies1 -= candyToGive

                peopleArray[peopleIndex] += candyToGive
                peopleIndex++
            }

            if (peopleIndex == num_people) {

                peopleIndex = 0
            }

            candyToGive++
        }

        return peopleArray
    }
}