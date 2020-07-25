package com.guanhong.leetcodeeveryday.easy

class LeetCode1460 {

    fun canBeEqual(target : IntArray, arr : IntArray) : Boolean {

        return (target.sorted() == arr.sorted())
    }
}