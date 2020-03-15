package com.guanhong.leetcodeeveryday

class LeetCode605 {

    fun canPlaceFlowers(flowerbed : IntArray, n : Int) : Boolean {

        if (flowerbed.count() == 1) return !(n == 1 && flowerbed[0] == 1)

        var changeCount = 0

        for (index in 0 until flowerbed.count()) {

            when (index) {
                0 -> {

                    if (flowerbed[0] == 0 &&
                        flowerbed[1] == 0
                    ) {

                        flowerbed[0] = 1
                        changeCount++
                    }
                }
                flowerbed.lastIndex -> {

                    if (flowerbed[flowerbed.lastIndex - 1] == 0 &&
                        flowerbed[flowerbed.lastIndex] == 0
                    ) {

                        flowerbed[flowerbed.lastIndex] = 1
                        changeCount++
                    }
                }
                else -> {

                    if (flowerbed[index] == 0 &&
                        flowerbed[index - 1] == 0 &&
                        flowerbed[index + 1] == 0
                    ) {

                        flowerbed[index] = 1
                        changeCount++
                    }
                }
            }
        }

        return changeCount >= n
    }
}