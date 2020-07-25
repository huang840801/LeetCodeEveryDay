package com.guanhong.leetcodeeveryday

import com.guanhong.leetcodeeveryday.easy.LeetCode345
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode345Test {

    private lateinit var leetCode345 : LeetCode345

    @Before
    fun setUp() {

        leetCode345 = LeetCode345()
    }

    @Test
    fun reverseVowels1(){

        val actual = leetCode345.reverseVowels("hello")

        assertThat(actual, `is`(equalTo("holle")))
    }
    @Test
    fun reverseVowels2(){

        val actual = leetCode345.reverseVowels("leetcode")

        assertThat(actual, `is`(equalTo("leotcede")))
    }
    @Test
    fun reverseVowels3(){

        val actual = leetCode345.reverseVowels("helloo")

        assertThat(actual, `is`(equalTo("holloe")))
    }
    @Test
    fun reverseVowels4(){

        val actual = leetCode345.reverseVowels("qwrty")

        assertThat(actual, `is`(equalTo("qwrty")))
    }
    @Test
    fun reverseVowels5(){

        val actual = leetCode345.reverseVowels("")

        assertThat(actual, `is`(equalTo("")))
    }
    @Test
    fun reverseVowels6(){

        val actual = leetCode345.reverseVowels("aei")

        assertThat(actual, `is`(equalTo("iea")))
    }
    @Test
    fun reverseVowels7(){

        val actual = leetCode345.reverseVowels("Ee8")

        assertThat(actual, `is`(equalTo("eE8")))
    }
    @Test
    fun reverseVowels8(){

        val actual = leetCode345.reverseVowels("e8")

        assertThat(actual, `is`(equalTo("e8")))
    }
    @Test
    fun reverseVowels9(){

        val actual = leetCode345.reverseVowels("Eaoue8")

        assertThat(actual, `is`(equalTo("euoaE8")))
    }
}