package com.aga.test.kotlin.basics

fun main(args: Array<String>) {
    val employeeOne = Employee("Mary", 100)
    //String
    val change = 4.22
    println("Value of change = $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("Value of $numerator divided by $denominator is ${numerator / denominator}")

    println("Employee's id is ${employeeOne.id}")

    //Raw string
    val filePath = """c:\user\agnes"""
    val longString = """
            *Long
            *String
            *Is
            *Cool
            *$filePath
            """.trimMargin("*")

    println(filePath)
    println(longString)
}