package com.guanhong.leetcodeeveryday.medium

class LeetCode134 {

    fun canCompleteCircuit(gasArray : IntArray, cost : IntArray) : Int {

        gasArray.forEachIndexed { index, gas ->

            if (helper(gasArray, cost, index)) {

                return index
            }
        }

        return -1
    }

    private fun helper(gasArray : IntArray, cost : IntArray, startPosition : Int) : Boolean {

        var nowGas = 0
        var position = startPosition + 1

        if (startPosition == gasArray.lastIndex) {
            position = 0
        }

        nowGas += gasArray[startPosition]
        nowGas -= cost[startPosition]

        if (nowGas < 0) {

            return false
        }

        while (position != startPosition) {

            nowGas += gasArray[position]
            nowGas -= cost[position]

            if (nowGas < 0) {

                return false
            }

            if (position == gasArray.lastIndex) {

                position = 0
            } else {

                position++
            }
        }

        return true
    }
}