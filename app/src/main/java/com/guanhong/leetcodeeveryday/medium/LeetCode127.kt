package com.guanhong.leetcodeeveryday.medium

import kotlin.math.min

class LeetCode127 {

    fun ladderLength(beginWord : String, endWord : String, wordList : List<String>) : Int {

        return helper(beginWord, endWord, wordList, 0)
    }

    fun helper(
        beginWord : String,
        endWord : String,
        wordList : List<String>,
        stepCount : Int
    ) : Int {

        if (beginWord == endWord) return stepCount + 1

        if (wordList.contains(endWord)) {

            var answer = 0

            wordList.forEach { word ->

                if (onlyALetterDiff(word, beginWord)) {

                    val list = wordList.map { it }.toMutableList()
                    list.remove(word)

                    val thisStepCount = helper(word, endWord, list, stepCount + 1)

                    if (thisStepCount > 0) {

                        answer = if (answer == 0) {

                            thisStepCount
                        } else {

                            min(answer, thisStepCount)
                        }
                    }
                }
            }

            return answer
        } else {

            return 0
        }
    }

    fun onlyALetterDiff(word1 : String, word2 : String) : Boolean {

        if (word1.count() != word2.count()) {

            return false
        } else {

            var diffTime = 0

            word1.forEachIndexed { index, char ->

                if (word2[index] != char) {

                    diffTime++

                    if (diffTime == 2) {

                        return false
                    }
                }
            }

            return diffTime == 1
        }
    }
}