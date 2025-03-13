package com.lannstark.lec14

data class PersonDto(
    val name: String,
    val age: Int
)

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("한국")
        Country.USA -> println("미국")
        Country.JAPAN -> println("일본")
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    USA("US"),
    JAPAN("JP")
    ;
}