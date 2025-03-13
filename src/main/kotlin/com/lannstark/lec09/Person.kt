package com.lannstark.lec09

fun main() {
    val person = Person("최태현", 29)
    println(person.name)

    person.age = 10
    println(person.age)
}

class Person(name: String, var age: Int) {
//    val upperName: String
//        get() = this.name.uppercase()
//
//    fun getUpperName(): String {
//        return name.uppercase()
//    }

    var name = name
        set(value) {
            println("name setter 호출")
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("주 생성자 호출")
    }

    fun isAdult(): Boolean {
        return age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20

    constructor(name: String): this(name, 1) {
        println("보조1 생성자 호출")
    }

    constructor(): this("홍길동") {
        println("보조2 생성자 호출")
    }
}