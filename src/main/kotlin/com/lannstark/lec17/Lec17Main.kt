package com.lannstark.lec17

fun main() {
    val fruits = listOf(
        Fruit("Apple", 1000),
        Fruit("Banana", 2000),
        Fruit("Cherry", 3000),
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "Apple"
    }

    val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "Apple"}

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruit(fruits, {it.name == "Apple"})
}

private fun filterFruit(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean,
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}
