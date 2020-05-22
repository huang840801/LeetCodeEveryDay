package com.guanhong.leetcodeeveryday

class LeetCode1108 {

    fun defangIPaddr(address : String) : String {
        return address.replace(".", "[.]")
    }
}