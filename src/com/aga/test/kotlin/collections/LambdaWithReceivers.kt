package com.aga.test.kotlin.collections
import java.lang.StringBuilder

fun main(args: Array<String>) {
    val employees = listOf(
        Employee("John", "Smith", 2011),
        Employee("Mary", "Wilson", 2012),
        Employee("Mike", "Johnson", 2002),
        Employee("Jane", "Smith", 2012))


    println(countTo100())
    println(countTo100WithFunction())
    println(countTo100WithFunctionExpressionBody())
    println(countTo100WithApply())

    findEmployeeByLastName(employees, "Wilson")
    findEmployeeByLastName(employees, "Novak")

    //referring to object from nested apply function
    "String Example".apply string1@{
        "Another String".apply {
            println(toLowerCase())
            println(this@string1.toUpperCase())
        }
    }

}
fun findEmployeeByLastName(employees: List<Employee>, lastName: String)
    {
        employees.forEach returnBlock@ {
            if( it.lastName == lastName) {
                println("Yes, there is an employee with last name $lastName")
                return@returnBlock
            }
        }
        println("No, there is no employee with last name $lastName")
    }

fun countTo100() : String {
val numbers = StringBuilder()
    for (i in 1..99){
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}


fun countTo100WithFunction() : String {
    val numbers = StringBuilder()
    return with(numbers) {
        for (i in 1..99){
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

fun countTo100WithFunctionExpressionBody() : String =
    with(StringBuilder()) {
        for (i in 1..99){
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }

fun countTo100WithApply() : String =
    StringBuilder().apply {
        for (i in 1..99){
            append(i)
            append(", ")
        }
        append(100)
    }.toString()