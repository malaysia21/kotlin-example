package com.aga.test.kotlin.basics

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val number: Int
    val number2 = 25
    val numberShort: Short = 25  //without types would be Int
    var numberMutable = 25

    //instance
    val employee = Employee("Kate Jones", 100)
    employee.name = "Kate Smith";

    //set
    val employees: EmployeeSet = HashSet()
    employees.plus(employee)

    //array
    val names = arrayListOf("James", "Mary")
    println(names[1])

    //bit operator
    val x = 0x00101101
    val y = 0x11011011

    println(x or y)
    println(x and y)
    println(x xor y)

    //instance of
    val employeeOne = Employee("Mary", 100)
    val something: Any = employeeOne
    if (something is Employee) {
        //val newEmployee = something as Employee
        println(something)
    }
}
