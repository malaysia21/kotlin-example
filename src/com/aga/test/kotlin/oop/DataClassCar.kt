package com.aga.test.kotlin.oop

data class DataClassCar(val color: String, val model: String, val year: Int) {
}

fun main(args: Array<String>) {
    val car = DataClassCar("white", "opel", 2021)
    val car2 = DataClassCar("white", "opel", 2021)

    println("Data Class Car: $car")
    println("Data Classes equality: ${car == car2}")
    println("Data Classes reference equality: ${car === car2}")

    val car3 = car.copy(year = 2020);
    println("Data Class Copy Car: $car3")
}