package com.guanhong.leetcodeeveryday

class LeetCode733 {

    fun floodFill(image : Array<IntArray>, sr : Int, sc : Int, newColor : Int) : Array<IntArray> {

        if (image[sr][sc] == newColor) return image

        return floodFill(image, sr, sc, image[sr][sc], newColor)
    }

    fun floodFill(
        image : Array<IntArray>,
        sr : Int,
        sc : Int,
        oldColor : Int,
        newColor : Int
    ) : Array<IntArray> {

        if (sr >= image.size ||
            sr < 0 ||
            sc >= image[0].size ||
            sc < 0 ||
            image[sr][sc] != oldColor
        ) return image

        image[sr][sc] = newColor
        floodFill(image, sr + 1, sc, oldColor, newColor)
        floodFill(image, sr - 1, sc, oldColor, newColor)
        floodFill(image, sr, sc + 1, oldColor, newColor)
        floodFill(image, sr, sc - 1, oldColor, newColor)

        return image
    }
}