package com.guanhong.leetcodeeveryday.medium

class LeetCode15 {

    fun threeSum(nums : IntArray) : List<List<Int>> {

        if (nums.count() < 3) return listOf()

        val mutableMap = mutableMapOf<Int, Int>()

        val answerList = mutableListOf<List<Int>>()

        for (i in 0 until nums.count() - 1) {

            val firstNum = nums[i]

            for (j in (i + 1) until nums.count()) {

                val secondNum = nums[j]

                if (mutableMap.containsValue(-(firstNum + secondNum))) {
                    if (!isListDuplicate(answerList, listOf(-(firstNum + secondNum), firstNum, secondNum))) {

                        answerList.add(listOf(-(firstNum + secondNum), firstNum, secondNum))
                    }
                }
            }

            mutableMap[i] = firstNum
        }

        return answerList
    }

    fun isListDuplicate(answerList : List<List<Int>>, list : List<Int>) : Boolean {

        return answerList.any {

            it.sorted() == list.sorted()
        }
    }
//    fun threeSum(nums : IntArray) : List<List<Int>> {
//
//        val ans : MutableList<List<Int>> = mutableListOf()
//        if (nums.size < 3) return ans
//        nums.sort()
//        for (i in nums.indices) {
//
//            if (i != 0 && nums[i] == nums[i - 1]) continue
////            println(" i " + i + "，nums[i] " + nums[i])
////            println("nums[i-1] " + (nums[i] == nums[i - 1]))
//            var j = i + 1
//            var k = nums.size - 1
//            while (j < k) {
//                when {
//                    nums[j] + nums[k] + nums[i] == 0 -> {
//                        ans.add(listOf(nums[i], nums[j++], nums[k--]))
//                        while (j < k && nums[j] == nums[j - 1]) j++
//                        while (j < k && nums[k] == nums[k + 1]) k--
//                    }
//                    nums[j] + nums[k] + nums[i] > 0 -> k--
//                    else -> j++
//                }
//            }
//        }
//        return ans.toList()
//    }
}