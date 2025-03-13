package com.lannstark.lec13

fun main() {}

class House(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    class LivingRoom(
        private val area: Double,
    )
}