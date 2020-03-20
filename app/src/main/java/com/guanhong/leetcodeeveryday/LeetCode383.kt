package com.guanhong.leetcodeeveryday

class LeetCode383 {

    fun canConstruct(ransomNote : String, magazine : String) : Boolean {

        val magazineArray = arrayOfNulls<String>(magazine.count())

        magazine.forEachIndexed { index, c ->

            magazineArray[index] = c.toString()
        }

        ransomNote.forEach { char ->

            val ransomNoteElementInMagazineArray =
                magazineArray.firstOrNull { it == char.toString() }

            if (ransomNoteElementInMagazineArray != null) {

                val indexOfRansomNoteElementInMagazineArray =
                    magazineArray.indexOf(ransomNoteElementInMagazineArray)

                magazineArray[indexOfRansomNoteElementInMagazineArray] = " "
            } else {
                return false
            }
        }

        return true
    }
}