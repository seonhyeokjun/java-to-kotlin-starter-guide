package com.lannstark.lec06

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 0) {
        println(i)
    }

    for (i in 1..3 step 2) {
        println(i)
    }

    whatsUp@ for (i in 1..3) {
        println(i)
    }
}