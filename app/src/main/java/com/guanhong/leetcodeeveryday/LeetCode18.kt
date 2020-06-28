package com.guanhong.leetcodeeveryday

class LeetCode18 {

    fun fourSum(nums : IntArray, target : Int) : List<List<Int>> {

        if (nums.count() < 4) return listOf()

        val answer = mutableListOf<List<Int>>()

        val map = mutableMapOf<Int, Int>()

        for (index in 0 until nums.count() - 2) {

            val i = nums[index]

            for (index1 in index + 1 until nums.count() - 1) {

                for (index2 in index1 + 1 until nums.count()) {

                    val i1 = nums[index1]

                    val i2 = nums[index2]

                    val isSumMatch = map.containsValue(
                        target - i - i1 - i2
                    )

                    val isNotDuplicate = answer.none {

                        it.isListDuplicate(
                            listOf(
                                target - i - i1 - i2,
                                i,
                                i1,
                                i2
                            )
                        )
                    }
                    if (isSumMatch && isNotDuplicate) {

                        answer.add(
                            listOf(
                                target - i - i1 - i2,
                                i,
                                i1,
                                i2
                            )
                        )
                    }
                }
            }

            map[index] = i
        }

        return answer
    }

    private fun List<Int>.isListDuplicate(list2 : List<Int>) : Boolean {

        return this.sorted() == list2.sorted()
    }
}