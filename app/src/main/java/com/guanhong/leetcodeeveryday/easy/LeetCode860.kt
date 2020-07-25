package com.guanhong.leetcodeeveryday.easy

class LeetCode860 {

    fun lemonadeChange(bills : IntArray) : Boolean {

        if (!bills.all { it == 5 || it == 10 || it == 20 }) return false

        val mutableMap = mutableMapOf(5 to 0, 10 to 0, 20 to 0)

        bills.forEach {

            if (it == 5) {

                mutableMap[5] = mutableMap[5]!! + 1
            } else {

                var bill = it

                while (bill >= 25 && mutableMap[20]!! > 0) {

                    bill -= 20
                    mutableMap[20] = mutableMap[20]!! - 1
                }
                while (bill >= 15 && mutableMap[10]!! > 0) {

                    bill -= 10
                    mutableMap[10] = mutableMap[10]!! - 1
                }
                while (bill >= 10 && mutableMap[5]!! > 0) {

                    bill -= 5
                    mutableMap[5] = mutableMap[5]!! - 1
                }

                if (bill != 5) {

                    return false
                } else {

                    mutableMap[it] = mutableMap[it]!! + 1
                }
            }
        }

        return true
    }
}