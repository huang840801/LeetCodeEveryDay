package com.guanhong.leetcodeeveryday.easy

class LeetCode299 {

    fun getHint(secret : String, guess : String) : String {

        var newSecret = ""
        var newGuess = ""
        var aCount = 0
        var bCount = 0

        for (index in 0 until secret.count()) {

            if (secret[index] == guess[index]) {

                aCount++
            } else {

                newSecret += secret[index]
                newGuess += guess[index]
            }
        }

        newSecret.forEach {

            if (newGuess.contains(it)) {

                bCount++

                val indexOf = newGuess.indexOf(it)

                newGuess = newGuess.removeRange(indexOf, indexOf + 1)
            }
        }

        return """${aCount}A${bCount}B"""
    }
}