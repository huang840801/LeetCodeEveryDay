package com.guanhong.leetcodeeveryday

class LeetCode836 {

    fun isRectangleOverlap(rec1 : IntArray, rec2 : IntArray) : Boolean {

        val oneTopY = rec1[2]
        val oneBottomY = rec1[0]
        val oneRightX = rec1[3]
        val oneLeftX = rec1[1]

        val twoTopY = rec2[2]
        val twoBottomY = rec2[0]
        val twoRightX = rec2[3]
        val twoLeftX = rec2[1]

        val isOneTopThanTwo = oneTopY > twoTopY
        val isOneRightThanTwo = oneRightX > twoRightX

        val isXOverlap = if (isOneTopThanTwo) {

            oneBottomY < twoTopY
        } else {

            oneTopY > twoBottomY
        }

        val isYOverlap = if (isOneRightThanTwo) {

            oneLeftX < twoRightX
        } else {

            oneRightX > twoLeftX
        }

        return isXOverlap && isYOverlap
    }
}