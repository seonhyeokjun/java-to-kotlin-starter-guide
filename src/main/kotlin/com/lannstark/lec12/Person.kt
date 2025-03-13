package com.lannstark.lec12

import com.lannstark.lec10.Flyable

fun main() {
    moveSomething(object : Movable{
        override fun move() {
            println("움직입니다.")
        }

        override fun fly() {
            println("날아갑니다.")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
){
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String) = Person(name, MIN_AGE)

        override fun log() {
            println("Person 로그")
        }
    }
}

object Singleton{
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}