package com.lannstark.lec11

val a = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

class Cat private constructor() {

}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
){
    var price = _price
        private set
}