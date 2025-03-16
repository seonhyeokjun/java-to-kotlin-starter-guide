package com.lannstark.lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

fun String.lastChar(): Char = this[this.length - 1]