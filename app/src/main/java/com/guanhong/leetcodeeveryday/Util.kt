package com.guanhong.leetcodeeveryday

class Util {

    private object Holder {

        val INSTANCE = Util()
    }

    companion object {

        val instance by lazy { Holder.INSTANCE }
    }

    fun getMax(intArray : IntArray) : Int {

        if (intArray.count() == 0) {

            return -99
        }

        var answer = intArray[0]

        for (num in intArray) {

            if (num > answer) {

                answer = num
            }
        }

        return answer
    }
}