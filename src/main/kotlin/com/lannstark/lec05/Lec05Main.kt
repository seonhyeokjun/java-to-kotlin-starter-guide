package com.lannstark.lec05

fun main() {
}

fun validatePassword(score: Int) {
    if (score !in 0..10) {
        throw IllegalArgumentException("잘못된 점수: $score")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 60) {
        "합격입니다"
    } else {
        "불합격입니다"
    }
}

fun getGrade(score: Int): String {
    return when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "F"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "F"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("주어진 숫자는 1, 0, -1 중 하나입니다")
        else -> println("주어진 숫자는 1, 0, -1 중 하나가 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수입니다")
    }
}