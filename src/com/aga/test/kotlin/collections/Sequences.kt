package com.aga.test.kotlin.collections

fun main(args: Array<String>) {
    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2021),
        17 to Car("white", "Opel", 2020),
        18 to Car("black", "Opel", 2020)
    )

    println(immutableMap
        .filter { it.value.model == "Opel" }
        .map { it.value.color })

    println(immutableMap.asSequence()
        .filter { it.value.model == "Opel" }
        .map { it.value.color }
        .toList())

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'M' }
        .map { println("mapping $it"); it.toUpperCase() }
        .find { it.endsWith('Y') }
}