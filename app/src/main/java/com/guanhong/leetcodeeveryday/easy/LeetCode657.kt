package com.guanhong.leetcodeeveryday.easy

class LeetCode657 {

    fun judgeCircle(moves : String) : Boolean {

        var verticalMove = 0
        var horizontalMove = 0

        moves.forEach {

            when (it) {
                'U' -> verticalMove++
                'D' -> verticalMove--
                'L' -> horizontalMove++
                'R' -> horizontalMove--
                else -> {
                }
            }
        }

        return verticalMove == 0 && horizontalMove == 0
    }
}