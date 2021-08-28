package com.aga.test.kotlin.basics

fun main(args: Array<String>) {
    //equals
    val employeeOne = Employee("Mary", 100)
    val employeeTwo = Employee("John", 200)
    val employeeThree = Employee("John", 200)

    println(employeeOne == employeeTwo) //false
    println(employeeTwo == employeeThree) //true
    println(employeeTwo === employeeThree) //false
    println(employeeOne.equals(employeeTwo)) //false
    println(employeeTwo.equals(employeeThree)) //true

}