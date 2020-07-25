package com.guanhong.leetcodeeveryday.easy

class LeetCode1189 {

    fun maxNumberOfBalloons(text : String) : Int {

        var answer = 0

        var countOfB = 0
        var countOfA = 0
        var countOfL = 0
        var countOfO = 0
        var countOfN = 0

        text.forEach {

            when (it) {
                'b' -> countOfB += 1
                'a' -> countOfA += 1
                'l' -> countOfL += 1
                'o' -> countOfO += 1
                'n' -> countOfN += 1
            }

            if (countOfB >= 1 &&
                countOfA >= 1 &&
                countOfL >= 2 &&
                countOfO >= 2 &&
                countOfN >= 1) {

                answer += 1

                countOfB -=1
                countOfA -=1
                countOfL -=2
                countOfO -=2
                countOfN -=1
            }
        }

        return answer
    }
}