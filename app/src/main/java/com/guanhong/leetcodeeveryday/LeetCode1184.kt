package com.guanhong.leetcodeeveryday

import kotlin.math.min
import kotlin.math.max

class LeetCode1184 {

    fun distanceBetweenBusStops(distance : IntArray, start : Int, destination : Int) : Int {

        var counterclockwise = 0
        var clockwise = 0

        val newStart = min(start, destination)
        val newDestination = max(start, destination)

        for (index in 0 until distance.count()) {

            if (index < newStart || index >= newDestination) {

                counterclockwise += distance[index]
            } else {

                clockwise += distance[index]
            }
        }

        return min(counterclockwise, clockwise)
    }
}