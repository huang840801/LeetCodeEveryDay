package com.guanhong.leetcodeeveryday

class LeetCode350 {

    fun intersect(nums1 : IntArray, nums2 : IntArray) : IntArray {

        if (nums1.count() == 0) return intArrayOf()
        if (nums2.count() == 0) return intArrayOf()

        val answer = mutableListOf<Int>()

        val sortedNum1 = nums1.sorted().toMutableList()
        val sortedNum2 = nums2.sorted().toMutableList()

        val max1 = sortedNum1.max()!!
        val max2 = sortedNum2.max()!!
        val min1 = sortedNum1.min()!!
        val min2 = sortedNum2.min()!!

        when {

            (max1 >= max2 && min1 <= min2) -> {

                sortedNum2.forEach {

                    if (sortedNum1.contains(it)) {

                        sortedNum1.remove(it)
                        answer.add(it)
                    }
                }
            }

            (max2 >= max1 && min2 <= min1) -> {

                sortedNum1.forEach {

                    if (sortedNum2.contains(it)) {

                        sortedNum2.remove(it)
                        answer.add(it)
                    }
                }
            }

            (max1 >= max2 && min1 >= min2) -> {

                sortedNum1.forEach {

                    if (it <= max2 && sortedNum2.contains(it)) {

                        sortedNum2.remove(it)
                        answer.add(it)
                    }
                }
            }

            (max2 >= max1 && min2 >= min1) -> {

                sortedNum2.forEach {

                    if (it <= max1 && sortedNum1.contains(it)) {

                        sortedNum1.remove(it)
                        answer.add(it)
                    }
                }
            }
        }

        return answer.toIntArray()
    }
}