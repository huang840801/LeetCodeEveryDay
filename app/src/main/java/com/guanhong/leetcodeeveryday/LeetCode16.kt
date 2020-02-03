package com.guanhong.leetcodeeveryday

class LeetCode16 {

    fun threeSumClosest(nums : IntArray, target : Int) : Int {

        var answer = 0
        var minDistance = Int.MAX_VALUE

        val sortedNums = nums.sorted()

        for (i in 0 until sortedNums.count() - 2) {

            if (sortedNums[i] < target ||
                sortedNums[i] < 0 ||
                twoNumDistance(sortedNums[i], target) < minDistance
            ) {

                for (j in (i + 1) until sortedNums.count() - 1) {

                    if (sortedNums[i] + sortedNums[j] < target ||
                        sortedNums[i] + sortedNums[j] < 0 ||
                        twoNumDistance(sortedNums[i] + sortedNums[j], target) < minDistance
                    ) {

                        for (k in (j + 1) until sortedNums.count()) {

                            val sum = sortedNums[i] + sortedNums[j] + sortedNums[k]

                            if (twoNumDistance(sum, target) < minDistance) {

                                minDistance = twoNumDistance(sum, target)

                                println("$i,$j,$k,sum=$sum")
                                answer = sum
                            }
                        }
                    }
                }
            }
        }

        return answer
    }

    fun twoNumDistance(num1 : Int, num2 : Int) : Int {

        return if (num1 > num2) {

            num1 - num2
        } else {
            num2 - num1
        }
    }
}