package com.guanhong.leetcodeeveryday.easy

class LeetCode929 {

    fun numUniqueEmails(emails : Array<String>) : Int {

        val set = mutableSetOf<String>()

        emails.forEach {

            val list = it.split("@")
            val local = list[0]
            val domain = list[1]

            val filterLocal = if (local.contains("+")) {

                local.substring(0, local.indexOf("+")).replace(".", "")
            } else {

                local.replace(".", "")
            }

            set.add("$filterLocal $domain")
        }

        return set.count()
    }
}