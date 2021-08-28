package com.aga.test

import com.aga.test.kotlin.callingjava.Car

fun main(args: Array<String>) {
    var car = Car("red", "Audi", null)
    car.color = null
    car.color = "green"

    println(car)
    println(car.color)

    var model : String? = car.model
    model = null
    println(model)

    //example with varargs method
    car.variableMethod(10, "test1", "test2", "test3")
    val strings = arrayOf("test1", "test2")

    //example with varargs method - arrays has to be unpacked with spread operator
    car.variableMethod(10, *strings)

    //passing primitive array to the method
    car.intArray(arrayOf(1,2,3).toIntArray())
    car.intArray(intArrayOf(1,2,3))

    //passing Any as Object from java
    car.anyObject = Any()

    //calling static members
    println(Car.staticMethod())
    println(Car.staticVariable)

    //Calling interface
    car.demoMethod {println("Thread")}

}