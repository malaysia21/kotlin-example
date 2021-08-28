package com.aga.test.kotlin.collections

fun main(args: Array<String>) {

    val immutableMap = mapOf<Int, Car?>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2021),
        3 to null
    )

    val mutableMap = mutableMapOf<Int, Car?>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2021),
        3 to null,
        17 to Car("white", "Opel", 2020),
        18 to Car("black", "Opel", 2020)
    )

    val setInts = setOf(10, 55, 19, -23)

    println(setInts.filter { it %2 != 0 })
    println(immutableMap.filter { it.value?.year == 2021 })
    println(mutableMap.filter { it.value?.color == "green" })

    //adding to each element 10 with map
    val intsArray = arrayOf(1,2,4,5,6)
    val addToList =intsArray.map {  it +10 }
    println(addToList)

    println(mutableMap.map { it.value?.year })

    println(mutableMap
        .filter { it.value?.model == "Opel" }
        .map { it.value?.color })

    println(immutableMap.filter { it.value != null }.all { it.value?.year!! > 2014 })

    println(immutableMap.filter { it.value != null }.any { it.value?.year!! > 2014 })

    println(immutableMap.filter { it.value != null }.count { it.value?.year!! > 2014 })

    val cars = immutableMap.values
    println(cars.find { it?.year!! > 2014 })

    println(cars.groupBy { it?.color })

    println(cars.sortedBy { it?.year })

    println(immutableMap.toSortedMap())


}