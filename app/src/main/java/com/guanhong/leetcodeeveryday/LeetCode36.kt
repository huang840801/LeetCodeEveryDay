package com.guanhong.leetcodeeveryday

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

                when (rowIndex) {

                    in 0..2 -> {

                        when (columnIndex) {
                            in 0..2 -> {

                                subBoxMap[0]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }

                            in 3..5 -> {

                                subBoxMap[1]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }
                            in 6..8 -> {

                                subBoxMap[2]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }
                        }
                    }
                    in 3..5 -> {
                        when (columnIndex) {
                            in 0..2 -> {

                                subBoxMap[3]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }

                            in 3..5 -> {

                                subBoxMap[4]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }
                            in 6..8 -> {

                                subBoxMap[5]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }
                        }
                    }
                    in 6..8 -> {

                        when (columnIndex) {
                            in 0..2 -> {

                                subBoxMap[6]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }

                            in 3..5 -> {

                                subBoxMap[7]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }
                            in 6..8 -> {

                                subBoxMap[8]!![(rowIndex % 3) * 3 + columnIndex % 3] = char
                            }
                        }
                    }
                }
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