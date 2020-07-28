package com.guanhong.leetcodeeveryday.easy

class LeetCode1496 {

    fun isPathCrossing(path : String) : Boolean {

        val coordinateList = mutableListOf(Coordinate(0, 0))

        var x = 0
        var y = 0

        path.forEach {

            when (it) {
                'N' -> y++
                'S' -> y--
                'E' -> x++
                'W' -> x--
            }
            if (isCross(Coordinate(x, y), coordinateList)) {

                return true
            }
            coordinateList.add(Coordinate(x, y))
        }

        return false
    }

    private fun isCross(coordinate : Coordinate, coordinateList : List<Coordinate>) : Boolean {

        return coordinateList.firstOrNull { it == coordinate } != null
    }
}

data class Coordinate(

    val x : Int,
    val y : Int
)