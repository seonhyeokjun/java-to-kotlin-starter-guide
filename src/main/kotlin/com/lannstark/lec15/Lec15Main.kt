package com.lannstark.lec15

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val empty = emptyList<Int>()

    printNumbers(emptyList())

    mutableListOf(1, 2, 3, 4, 5)

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "one")
    oldMap.put(2, "two")

    mapOf(1 to "one", 2 to "two")
}

private fun printNumbers(numbers: List<Int>) {
    for (number in numbers) {
        println(number)
    }
}