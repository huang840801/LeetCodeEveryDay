package com.guanhong.leetcodeeveryday

class LeetCode {

    /**
     * test result
     */
    fun test() : Int {

        val magazine = "q"

        val answer = arrayOfNulls<String>(magazine.count())

        magazine.forEachIndexed { index, c ->

            answer[index] = c.toString()
        }
        return answer.count()
    }

    /**
     * 728
     */
    fun selfDividingNumbers(left : Int, right : Int) : List<Int> {

        val answerList = mutableListOf<Int>()

        for (num in left..right) {

            if (num > 0) {

                val numToString = num.toString()
                var isSelfDividingNumber = true

                for (char in numToString) {

                    val charToInt = char.toInt() - 48

                    if (charToInt == 0) {

                        isSelfDividingNumber = false
                        break
                    }

                    if (charToInt != 0 && num % charToInt != 0) {

                        isSelfDividingNumber = false
                        break
                    }
                }

                if (isSelfDividingNumber) {

                    answerList.add(num)
                }
            }
        }

        return answerList
    }

    /**
     * 908
     */
    fun smallestRangeI(A : IntArray, K : Int) : Int {

        if (A.count() == 0) return 0

        val max = A.max()!!
        val min = A.min()!!

        val newMin = min + K
        val newMax = max - K

        return if ((newMax - newMin) >= K) {

            newMax - newMin
        } else {
            0
        }
    }

    /**
     * 645
     */
    fun findErrorNums(nums : IntArray) : IntArray {

        var missnumber = 0
        var duplicateNumber = 0

        val mutableMap = mutableMapOf<Int, Int>()

        for (num in nums) {

            if (mutableMap[num] != null) {
                duplicateNumber = num
            }

            mutableMap[num] = num
        }

        for (i in 1..nums.count()) {

            if (mutableMap[i] == null) {

                missnumber = i
                break
            }
        }

        return intArrayOf(duplicateNumber, missnumber)
    }

    /**
     * 922
     */
    fun sortArrayByParityII(A : IntArray) : IntArray {

        val answerIntArray = IntArray(A.count())

        var evenIndex = 0
        var oddIndex = 1

        for (element in A) {

            if (element % 2 == 0) {

                answerIntArray[evenIndex] = element
                evenIndex += 2
            } else {

                answerIntArray[oddIndex] = element
                oddIndex += 2
            }
        }

        return answerIntArray
    }

    /**
     * 1287
     */
    fun findSpecialInteger(arr : IntArray) : Int {

        if (arr.count() == 1) return arr[0]

        val specialCount = (arr.count() / 4)

        for (i in 0 until arr.count()) {

            if (arr[i] == arr[i + specialCount]) {

                return arr[i]
            }
        }

        return -1
    }

    /**
     * 1221
     */
    fun balancedStringSplit(s : String) : Int {

        var answer = 0
        var numberOfL = 0
        var numberOfR = 0

        for (element in s) {

            if (element == 'R') {

                numberOfR++
            } else {

                numberOfL++
            }

            if (numberOfR > 0 && numberOfR == numberOfL) {

                numberOfL = 0
                numberOfR = 0

                answer++
            }
        }

        return answer
    }

    /**
     * 977
     */
    fun sortedSquares(A : IntArray) : IntArray {

        val answerIntArray = IntArray(A.count())

        val positiveArray = A.map { it * it }.toIntArray()

        for (i in 0 until A.count()) {

            val max = positiveArray.max()!!
            val indexOfMax = positiveArray.indexOf(max)

            answerIntArray[A.count() - i - 1] = max

            positiveArray[indexOfMax] = -1
        }

        return answerIntArray
    }

    /**
     * 867
     */
    fun transpose(A : Array<IntArray>) : Array<IntArray> {

        val answerArray = Array(A[0].count()) { IntArray(A.count()) }

        A.forEachIndexed { index, ints ->

            ints.forEachIndexed { index1, int ->

                answerArray[index1][index] = int
            }
        }

        return answerArray
    }

    /**
     * 766
     */
    fun isToeplitzMatrix(matrix : Array<IntArray>) : Boolean {

        val mutableMap = mutableMapOf<Int, Int>()

        matrix[0].forEachIndexed { index, i ->

            mutableMap[index] = i
        }

        var nowIntArrayIndex : Int

        matrix.forEachIndexed { index, intArray ->

            nowIntArrayIndex = index

            intArray.forEachIndexed { index1, i ->

                if (index != 0 && index1 != 0 && i != mutableMap[index1 - 1]) {

                    return false
                }
            }

            matrix[nowIntArrayIndex].forEachIndexed { index, i ->

                mutableMap[index] = i
            }
        }
        return true
    }

    /**
     * 268
     */
    fun missingNumber(nums : IntArray) : Int {

        val mutableMap = mutableMapOf<Int, Int>()

        nums.forEach {

            mutableMap[it] = it
        }

        for (i in 0 until nums.count()) {

            if (mutableMap[i] == null) {

                return i
            }
        }

        return nums.count()
    }

    /**
     * 819
     */
    fun mostCommonWord(paragraph : String, banned : Array<String>) : String {

        var s = ""

        val wordList = mutableListOf<String>()

        val characterList = listOf(
            'a',
            'b',
            'c',
            'd',
            'e',
            'f',
            'g',
            'h',
            'i',
            'j',
            'k',
            'l',
            'm',
            'n',
            'o',
            'p',
            'q',
            'r',
            's',
            't',
            'u',
            'v',
            'w',
            'x',
            'y',
            'z'
        )

        paragraph.toLowerCase().forEach { c ->

            if (characterList.any { it == c }) {

                s += c
            } else {

                if (s.isNotEmpty()) {

                    wordList.add(s)
                    s = ""
                }
            }
        }
        if (s.isNotEmpty()) {

            wordList.add(s)
        }

        val mutableMap = mutableMapOf<String, Int>()

        wordList.forEach { word ->

            if (!banned.any { it == word }) {

                if (mutableMap[word] == null) {

                    mutableMap[word] = 1
                } else {
                    mutableMap[word] = mutableMap[word]!! + 1
                }
            }
        }

        var answerValue = 0
        var answer = ""


        mutableMap.forEach {

            if (it.value > answerValue) {

                answerValue = it.value
                answer = it.key
            }
        }

        return answer
    }

    /**
     * 1266
     */
    fun minTimeToVisitAllPoints(points : Array<IntArray>) : Int {

        if (points.count() == 1) return 0

        var answer = 0
        var nextPoint : IntArray

        points.forEachIndexed { index, point ->

            if (index != points.count() - 1) {

                nextPoint = points[index + 1]

                val nowX = point[0]
                val nowY = point[1]

                val nextX = nextPoint[0]
                val nextY = nextPoint[1]

                val xDiffDistance = abs(nextX - nowX)
                val yDiffDistance = abs(nextY - nowY)

                answer += abs(xDiffDistance - yDiffDistance) + min(xDiffDistance, yDiffDistance)
            }
        }

        return answer
    }

    fun abs(num : Int) = if (num > 0) num else -num

    fun min(num1 : Int, num2 : Int) = if (num1 > num2) num2 else num1

    /**
     * 292
     */
    fun canWinNim(n : Int) : Boolean {

        return n % 4 != 0
    }

    /**
     * 263
     */
    fun isUgly(num : Int) : Boolean {

        return when {
            num == 1 -> true
            num % 2 == 0 -> isUgly(num / 2)
            num % 3 == 0 -> isUgly(num / 3)
            num % 5 == 0 -> isUgly(num / 5)

            else -> false
        }
    }

    /**
     * 970
     */
    fun powerfulIntegers(x : Int, y : Int, bound : Int) : List<Int> {

        val answerList = mutableListOf<Int>()

        val big : Int
        val small : Int

        if (x > y) {

            big = x
            small = y
        } else {
            big = y
            small = x
        }

        val biggestTime = if (bound != 1 && big != 1) {
            powerNumberMaxUnderBigNumber(bound, big, 0)
        } else {
            1
        }

        for (i in 2..bound) {

            loop@ for (j in 0..biggestTime) {

                if (isPower(i - power(big, j), small)) {

                    answerList.add(i)
                    break@loop
                }
            }
        }

        return answerList
    }

    fun power(num : Int, powerNumber : Int) : Int {

        if (powerNumber == 0) return 1
        var answer = 1
        for (i in 1..powerNumber) {

            answer *= num
        }

        return answer
    }

    fun powerNumberMaxUnderBigNumber(bigNumber : Int, smallNumber : Int, powerNumber : Int) : Int {

        return if (bigNumber < smallNumber) {

            powerNumber
        } else {

            powerNumberMaxUnderBigNumber(bigNumber / smallNumber, smallNumber, powerNumber + 1)
        }
    }

    fun isPower(bigNumber : Int, smallNumber : Int) : Boolean {

        when {

            (smallNumber == 1) -> return bigNumber == 1
            (bigNumber < 1) -> return false
            (bigNumber == 1) -> return true

            else -> {

                return if (bigNumber % smallNumber != 0) {

                    false
                } else {
                    isPower(bigNumber / smallNumber, smallNumber)
                }
            }
        }
    }
}