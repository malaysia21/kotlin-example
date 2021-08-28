package com.aga.test.kotlin.oop


fun main(args: Array<String>) {

    println(labelMultiply(2,5))
    println(labelMultiply2(2,5,"Result: "))
    println(labelMultiply2(label = "Result: ", parameter2 = 3, parameter1 = 4))

    val student = Student("Aga")
    println(student.upperCaseFirstName())

    //varargs operator
    val carOne = Car("blue", "Toyota", 2021)
    val carTwo = Car("red", "Toyota", 2021)
    val carThree = Car("white", "Toyota", 2021)

    printCarsColors(carOne, carTwo, carThree, str="Color")

    //spread operator
    val carArray = arrayOf(carOne, carTwo, carThree)
    printCarsColors(*carArray, str="Color")

    val carArray2 = arrayOf(carTwo, carThree)
    val allCars = arrayOf(*carArray, *carArray2)

    for(car in allCars){
        println(car)
    }
}

fun printCarsColors(vararg cars: Car, str: String) {
for(car in cars){
    println(car.color)
}
}

//function with block body
fun labelMultiply(parameter1: Int, parameter2: Int, label: String = "RESULT: "): String {
    return "$label ${parameter1*parameter2}"
}
//simplification for function with expression body
fun labelMultiply2(parameter1: Int, parameter2: Int, label: String): String = "$label ${parameter1*parameter2}"

//simplification for function with expression body
fun labelMultiply3(parameter1: Int, parameter2: Int, label: String) = "$label ${parameter1*parameter2}"

class Student(private val firstName: String){

    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int) {

}