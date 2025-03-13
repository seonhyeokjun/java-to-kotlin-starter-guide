package com.lannstark.lec10

interface Swimable {
    val swimAbility: Int

    fun act(){
        println("수영합니다.")
    }
}