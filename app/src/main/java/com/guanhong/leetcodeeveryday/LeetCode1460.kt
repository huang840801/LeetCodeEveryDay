package com.guanhong.leetcodeeveryday

class LeetCode1460 {

    fun canBeEqual(target : IntArray, arr : IntArray) : Boolean {

        return (target.sorted() == arr.sorted())
    }
}