package com.aga.test.kotlin.collections

fun main(args: Array<String>) {

    //immutable map
    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2010),
        2 to Car("red", "Ford", 2021),
        3 to Car("silver", "Honda", 2018)
    )

    println(immutableMap.javaClass)
    println(immutableMap)

    //mutable map
    val mutableMap = mutableMapOf<String, Car>(
        "John" to Car("green", "Toyota", 2010),
        "Tom" to Car("red", "Ford", 2021),
        "Kate" to Car("silver", "Honda", 2018)
    )
    println(mutableMap.javaClass)
    println(mutableMap)

    //mutable map - hashMap
    val mutableMapHashMap = hashMapOf<String, Car>(
        "John" to Car("green", "Toyota", 2010),
        "Tom" to Car("red", "Ford", 2021),
        "Kate" to Car("silver", "Honda", 2018)
    )
    mutableMapHashMap["Mary"] = Car("red", "Porsche", 1997)
    mutableMapHashMap.put("Mary2", Car("red", "Porsche", 1997))
    println(mutableMapHashMap.javaClass)
    println(mutableMapHashMap)

    //access to entry
    for (entry in mutableMapHashMap) {
        println(entry.key)
        println(entry.value)
    }

    //access to entry with destructuring declarations
    for ((key, value) in mutableMapHashMap) {
        println(key)
        println(value)
    }

    //pair class to variables
    val pair = Pair(10, "ten")
    val (firstValue, secondValue) = pair
    println(firstValue)
    println(secondValue)

    //destructing declaration for normal class
    val car = Car("green", "Toyota", 2010)
    val (carColor, carModel) = car
    println(carColor)
    println(carModel)
}

 class Car(val color: String, val model: String, val year: Int) {
    operator fun component1() = color
    operator fun component2() = model
    override fun toString(): String {
        return "Car(color='$color', model='$model', year=$year)"
    }
}