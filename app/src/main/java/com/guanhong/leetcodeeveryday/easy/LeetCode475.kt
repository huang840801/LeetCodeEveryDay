package com.guanhong.leetcodeeveryday.easy

import kotlin.math.abs

class LeetCode475 {

    fun findRadius(houses : IntArray, heaters : IntArray) : Int {

        var minRadius = 0

        val sortHouses = houses.sorted()
        val sortHeaters = heaters.sorted()

        sortHouses.forEach { housePosition ->

            var mostCloseHeaterPosition = 2147483647

            sortHeaters.forEach { heaterPosition ->

                val distanceBetweenHouseAndHeater = abs(housePosition - heaterPosition)

                if (distanceBetweenHouseAndHeater < mostCloseHeaterPosition) {

                    mostCloseHeaterPosition = distanceBetweenHouseAndHeater
                }
            }

            minRadius = kotlin.math.max(minRadius, mostCloseHeaterPosition)
        }

        return minRadius
    }
}