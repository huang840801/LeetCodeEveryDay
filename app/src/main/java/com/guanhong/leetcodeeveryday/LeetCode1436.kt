package com.guanhong.leetcodeeveryday

class LeetCode1436 {

    fun destCity(paths : List<List<String>>) : String {

        val map = mutableMapOf<String, Int>()

        paths.forEach { list ->

            list.forEachIndexed { index, string ->

                if (index == 0) {

                    if (map[string] == null) {

                        map[string] = 1
                    } else {

                        map[string] = map[string]!! + 1
                    }
                }
                if (index == 1) {

                    if (map[string] == null) {

                        map[string] = -1
                    } else {

                        map[string] = map[string]!! - 1
                    }
                }
            }
        }

        map.forEach {

            if (it.value == -1) {

                return it.key
            }
        }

        return ""
    }
}