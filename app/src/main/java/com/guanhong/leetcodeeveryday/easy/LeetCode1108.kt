package com.guanhong.leetcodeeveryday.easy

class LeetCode1108 {

    fun defangIPaddr(address : String) : String {
        return address.replace(".", "[.]")
    }
}