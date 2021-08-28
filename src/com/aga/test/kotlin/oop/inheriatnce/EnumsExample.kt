package com.aga.test.kotlin.oop.inheriatnce


fun main(args: Array<String>) {
    println(Department.HR.getDepartmentInfo())
}

enum class Department(val fullName: String, val numEmployees: Int) {

    HR("Human Resources", 5), IT("Information technology", 10), SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"
}