package com.lannstark.lec08

fun main() {
    repeat("Hello World", useNewLine = false)
    printAll(
        "Hello",
        "Kotlin",
        "Java")

    val array = arrayOf("Hello", "Kotlin", "Java")
    printAll(*array)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        print(str)
        if (useNewLine) {
            println()
        }
    }
}

fun printNameAndGender(name: String, gender: String = "male") {
    println("name: $name")
    println(gender)
}

fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}