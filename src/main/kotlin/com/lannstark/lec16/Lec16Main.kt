package com.lannstark.lec16

fun Person.nextYearAge() = this.age + 1

fun main() {
    val person = Person("lannstark", "back", 27)
    println(person.nextYearAge())
}