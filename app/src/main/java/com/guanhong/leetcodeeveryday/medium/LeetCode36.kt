package com.guanhong.leetcodeeveryday.medium

class LeetCode36 {

    fun isValidSudoku(board : Array<CharArray>) : Boolean {

        val columnMap = mutableMapOf<Int, CharArray>()
        val subBoxMap = mutableMapOf<Int, CharArray>()

        (0..8).forEach {

            columnMap[it] = CharArray(9)
            subBoxMap[it] = CharArray(9)
        }

        board.forEachIndexed { rowIndex, row ->

            if (!isValid(row)) {

                return false
            }

            row.forEachIndexed { columnIndex, char ->

                columnMap[columnIndex]!![rowIndex] = char

                val indexOfSubBox = rowIndex - (rowIndex % 3) + (columnIndex - columnIndex % 3) / 3

                val index = (rowIndex % 3) * 3 + columnIndex % 3

                subBoxMap[indexOfSubBox]!![index] = char
            }
        }

        subBoxMap.forEach {

            if (!isValid(it.value)) {

                return false
            }
        }

        columnMap.forEach {

            if (!isValid(it.value)) {

                return false
            }
        }

        return true
    }

    fun isValid(array : CharArray) : Boolean {

        val map = mutableMapOf<Char, Int>()

        array.forEach {

            if (it != '.') {

                if (map[it] == null) {

                    map[it] = 1
                } else {

                    return false
                }
            }
        }

        return true
    }
}