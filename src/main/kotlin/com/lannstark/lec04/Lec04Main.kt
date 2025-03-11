package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(1000L)
    val money2 = JavaMoney(2000L)
    println(money1.plus(money2))
}
