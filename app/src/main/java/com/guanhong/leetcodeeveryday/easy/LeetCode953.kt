package com.guanhong.leetcodeeveryday.easy

import kotlin.math.min

class LeetCode953 {

    fun isAlienSorted(words : Array<String>, order : String) : Boolean {

        var previousWord = words[0]

        for (index in 1 until words.count()) {

            val previousWordCount = previousWord.count()
            val thisWord = words[index]
            val thisWordCount = thisWord.count()

            val minLength = min(thisWordCount, previousWordCount)
            var isEqual = false

            loop@ for (index1 in 0 until minLength) {

                val previousIndex = order.indexOf(previousWord[index1])
                val nowIndex = order.indexOf(thisWord[index1])

                when {

                    previousIndex < nowIndex -> {

                        isEqual = false
                        break@loop
                    }
                    previousIndex == nowIndex -> {
                        isEqual = true
                    }
                    previousIndex > nowIndex -> {

                        return false
                    }
                }
            }

            if (isEqual) {

                if (previousWordCount > thisWordCount) {

                    return false
                }
            }

            previousWord = words[index]
        }

        return true
    }
}