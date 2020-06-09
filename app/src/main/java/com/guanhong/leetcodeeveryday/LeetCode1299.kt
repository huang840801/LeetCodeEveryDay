package com.guanhong.leetcodeeveryday

class LeetCode1299 {

    fun replaceElements(arr : IntArray) : IntArray {

        val answer = IntArray(arr.count())

        var nowMax = arr.max()!!

        val lastIndex = arr.lastIndex

        arr.forEachIndexed { index, int ->

            if (index == lastIndex) {

                answer[lastIndex] = -1
            } else {

                if (int == nowMax) {

                    nowMax = arr.toList().subList(index + 1, lastIndex + 1).max() ?: arr[lastIndex]
                }

                answer[index] = nowMax
            }
        }

        return answer
    }
}