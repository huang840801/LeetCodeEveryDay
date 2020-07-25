package com.guanhong.leetcodeeveryday.easy

class LeetCode496 {

    fun nextGreaterElement(nums1 : IntArray, nums2 : IntArray) : IntArray {

        val n1Count = nums1.count()
        val n2Count = nums2.count()

        val answer = IntArray(n1Count)
        var answerIndex = 0

        for (n1Index in 0 until n1Count) {

            val indexOfN1InNum2Array = nums2.indexOf(nums1[n1Index])

            if (indexOfN1InNum2Array == nums2.size - 1) {

                answer[answerIndex] = -1
                answerIndex++
            } else {

                for (n2Index in indexOfN1InNum2Array + 1 until n2Count) {

                    if (nums2[n2Index] > nums1[n1Index]) {

                        answer[answerIndex] = nums2[n2Index]
                        answerIndex++
                        break
                    }

                    if (n2Index == n2Count - 1) {

                        answer[answerIndex] = -1
                        answerIndex++
                    }
                }
            }
        }

        return answer
    }
}