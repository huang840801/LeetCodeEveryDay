package com.guanhong.leetcodeeveryday

import kotlin.math.max

class LeetCode849 {

    fun maxDistToClosest(seats : IntArray) : Int {

        var maxDistance : Int

        var tempDistance = 0

        var centerDistance = 0
        var forwardDistance = 0
        var backwardDistance = 0

        seats.forEach {

            if (it == 0) {

                tempDistance++
            } else {

                if (seats[0] == 0 && forwardDistance == 0) {

                    forwardDistance = tempDistance
                }

                centerDistance = max(centerDistance, tempDistance)

                tempDistance = 0
            }
        }

        if (tempDistance > 0) {

            backwardDistance = tempDistance
        }

        centerDistance = max(centerDistance, tempDistance)

        maxDistance = max(forwardDistance, (centerDistance + 1) / 2)
        maxDistance = max(maxDistance, backwardDistance)

        return maxDistance
    }
}