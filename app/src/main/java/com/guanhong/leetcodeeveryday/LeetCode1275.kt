package com.guanhong.leetcodeeveryday

class LeetCode1275 {

    fun tictactoe(moves : Array<IntArray>) : String {

        val field = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0)
        )

        var isPlayerA = true

        moves.forEach { move ->

            val row = move[0]
            val column = move[1]

            if (isPlayerA) {

                field[row][column] = 1
            } else {

                field[row][column] = 2
            }

            isPlayerA = !isPlayerA
        }

        return when (checkGameState(field)) {
            GameState.WINNER_IS_A -> "A"
            GameState.WINNER_IS_B -> "B"
            GameState.DRAW -> "Draw"
            GameState.PENDING -> "Pending"
        }
    }

    private fun checkGameState(field : Array<IntArray>) : GameState {

        val columnCount = field.first().count()

        /**
         * 檢查橫排
         */
        field.forEach { row ->

            if (row.all { it == 1 }) return GameState.WINNER_IS_A
            if (row.all { it == 2 }) return GameState.WINNER_IS_B
        }
        /**
         * 檢查直排
         */
        for (index in 0 until columnCount) {

            if (field.all { row -> row[index] == 1 }) return GameState.WINNER_IS_A
            if (field.all { row -> row[index] == 2 }) return GameState.WINNER_IS_B
        }

        /**
         * 檢查斜排
         */
        if (checkPositiveSlant(field) == GameState.WINNER_IS_A) return GameState.WINNER_IS_A
        if (checkPositiveSlant(field) == GameState.WINNER_IS_B) return GameState.WINNER_IS_B

        if (checkNegativeSlant(field) == GameState.WINNER_IS_A) return GameState.WINNER_IS_A
        if (checkNegativeSlant(field) == GameState.WINNER_IS_B) return GameState.WINNER_IS_B

        if (field.all { row -> row.all { it != 0 } }) return GameState.DRAW

        return GameState.PENDING
    }

    private fun checkPositiveSlant(field : Array<IntArray>) : GameState? {

        val rowCount = field.count()

        var playerACount = 0
        var playerBCount = 0

        for (row in 0 until rowCount) {

            when (field[row][row]) {

                1 -> playerACount++
                2 -> playerBCount++
            }
        }

        if (playerACount == rowCount) return GameState.WINNER_IS_A
        if (playerBCount == rowCount) return GameState.WINNER_IS_B

        return null
    }

    private fun checkNegativeSlant(field : Array<IntArray>) : GameState? {

        val rowCount = field.count()

        var playerACount = 0
        var playerBCount = 0

        var column = rowCount - 1

        for (row in 0 until rowCount) {

            when (field[row][column]) {

                1 -> playerACount++
                2 -> playerBCount++
            }

            column--
        }

        if (playerACount == rowCount) return GameState.WINNER_IS_A
        if (playerBCount == rowCount) return GameState.WINNER_IS_B

        return null
    }
}

enum class GameState {

    WINNER_IS_A,
    WINNER_IS_B,
    DRAW,
    PENDING
}