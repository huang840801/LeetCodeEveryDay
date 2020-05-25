package com.guanhong.leetcodeeveryday

class LeetCode1160 {

    fun countCharacters(words : Array<String>, chars : String) : Int {

        var answer = 0

        words.forEach {

            var chars = chars
            var word = it

            while (word.count() > 0) {

                val firstChar = word.first().toString()

                if (chars.contains(firstChar)) {

                    chars = chars.replaceFirst(firstChar, "")
                    word = word.replaceFirst(firstChar, "")
                } else {

                    return@forEach
                }
            }

            if (word.isEmpty()) {

                answer += it.count()
            }
        }

        return answer
    }
}