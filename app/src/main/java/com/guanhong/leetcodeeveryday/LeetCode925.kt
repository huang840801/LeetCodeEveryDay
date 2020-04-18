package com.guanhong.leetcodeeveryday

class LeetCode925 {

    fun isLongPressedName(name : String, typed : String) : Boolean {

        val mutableList1 = mutableListOf<String>()
        val mutableList2 = mutableListOf<String>()

        getSplitString(name, mutableList1)
        getSplitString(typed, mutableList2)

        if (mutableList1.count() != mutableList2.count()) return false

        for (index in 0 until mutableList1.count()) {

            if (mutableList2[index][0] != mutableList1[index][0]) return false

            if (mutableList2[index].count() < mutableList1[index].count()) return false
        }

        return true
    }

    private fun getSplitString(string : String, mutableList : MutableList<String>) {

        var previous = string[0]
        var stringTemp = string[0].toString()

        for (index in 1 until string.count()) {

            if (string[index] == previous) {

                stringTemp += string[index]
            } else {

                mutableList.add(stringTemp)
                stringTemp = string[index].toString()
            }

            previous = string[index]
        }

        mutableList.add(stringTemp)
    }
}