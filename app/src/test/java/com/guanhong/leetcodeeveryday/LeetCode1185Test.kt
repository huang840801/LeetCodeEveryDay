package com.guanhong.leetcodeeveryday

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class LeetCode1185Test {

    private lateinit var leetCode : LeetCode1185

    @Before
    fun setUp() {

        leetCode = LeetCode1185()
    }

    @Test
    fun testDayOfTheWeek1() {

        val expected = "Saturday"
        val actual = leetCode.dayOfTheWeek(31, 8, 2019)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek2() {

        val expected = "Sunday"
        val actual = leetCode.dayOfTheWeek(18, 7, 1999)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek3() {

        val expected = "Sunday"
        val actual = leetCode.dayOfTheWeek(15, 8, 1993)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek4() {

        val expected = "Friday"
        val actual = leetCode.dayOfTheWeek(1, 1, 1971)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek5() {

        val expected = "Saturday"
        val actual = leetCode.dayOfTheWeek(2, 1, 1971)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek6() {

        val expected = "Sunday"
        val actual = leetCode.dayOfTheWeek(31, 1, 1971)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek7() {

        val expected = "Monday"
        val actual = leetCode.dayOfTheWeek(1, 2, 1971)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek8() {

        val expected = "Monday"
        val actual = leetCode.dayOfTheWeek(1, 3, 1971)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek9() {

        val expected = "Sunday"
        val actual = leetCode.dayOfTheWeek(19, 12, 1971)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek10() {

        val expected = "Saturday"
        val actual = leetCode.dayOfTheWeek(1, 1, 1972)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek11() {

        val expected = "Tuesday"
        val actual = leetCode.dayOfTheWeek(1, 2, 1972)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek12() {

        val expected = "Monday"
        val actual = leetCode.dayOfTheWeek(28, 2, 1972)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek13() {

        val expected = "Tuesday"
        val actual = leetCode.dayOfTheWeek(29, 2, 1972)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek14() {

        val expected = "Wednesday"
        val actual = leetCode.dayOfTheWeek(1, 3, 1972)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek15() {

        val expected = "Thursday"
        val actual = leetCode.dayOfTheWeek(31, 8, 1972)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek16() {

        val expected = "Friday"
        val actual = leetCode.dayOfTheWeek(31, 8, 1973)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek17() {

        val expected = "Tuesday"
        val actual = leetCode.dayOfTheWeek(5, 1, 1999)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek18() {

        val expected = "Saturday"
        val actual = leetCode.dayOfTheWeek(5, 6, 1999)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek19() {

        val expected = "Saturday"
        val actual = leetCode.dayOfTheWeek(5, 1, 1980)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek20() {

        val expected = "Monday"
        val actual = leetCode.dayOfTheWeek(5, 1, 1981)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek21() {

        val expected = "Wednesday"
        val actual = leetCode.dayOfTheWeek(5, 1, 2000)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek22() {

        val expected = "Tuesday"
        val actual = leetCode.dayOfTheWeek(29, 2, 2000)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek23() {

        val expected = "Wednesday"
        val actual = leetCode.dayOfTheWeek(29, 3, 2000)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek24() {

        val expected = "Thursday"
        val actual = leetCode.dayOfTheWeek(29, 1, 2099)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek25() {

        val expected = "Sunday"
        val actual = leetCode.dayOfTheWeek(29, 3, 2099)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek26() {

        val expected = "Friday"
        val actual = leetCode.dayOfTheWeek(29, 1, 2100)

        assertEquals(expected, actual)
    }

    @Test
    fun testDayOfTheWeek27() {

        val expected = "Monday"
        val actual = leetCode.dayOfTheWeek(29, 3, 2100)

        assertEquals(expected, actual)
    }
}