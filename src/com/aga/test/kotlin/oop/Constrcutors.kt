package com.aga.test.kotlin.oop

const val MY_CONSTANT = 100

fun main(args: Array<String>) {

    println("Top level constant - $MY_CONSTANT")

    val emp = Employee("Kate")
    println(emp.firstName)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    emp2.fullTime = false
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo("Dummy").dummy)
}

// constructor
class Employee1 constructor(firstName: String){
    val firstName: String

    init {
        this.firstName = firstName
    }
}

//constructor simplification1
class Employee2 constructor(firstName: String){
    val firstName: String = firstName
}

//constructor simplification2
class Employee3 private constructor(val firstName: String){
}

//constructor simplification3
class Employee4 (val firstName: String){
}

//secondary constructor
class Employee5 (val firstName: String){
    var fullTime: Boolean = true
    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }
}

//default values in primary constructor
class Employee6 (val firstName: String, val fullTime: Boolean = true){
}

//class with custom setters/getters
class Employee (val firstName: String, fullTime: Boolean = true){
    var fullTime = fullTime
        //backing field
        get() {
            println("Running custom get")
            return field
        }
        set(value) {
            println("Running custom set")
            field = value
        }
}

//class without primary constructor
class Demo {
    val dummy: String

    constructor(dummy: String){
        this.dummy=dummy
    }
}