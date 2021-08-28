package com.aga.test.kotlin.collections

fun main(args: Array<String>) {
    val employees = listOf(
        Employee("John", "Smith", 2011),
        Employee("Mary", "Wilson", 2012),
        Employee("Mike", "Johnson", 2002),
        Employee("Jane", "Smith", 2012))


    //when more same results return first
    val longestWorkingEmployee = employees.minBy { e-> e.startYear }
    val shortestWorkingEmployee = employees.maxBy { it.startYear }
    val shortestWorkingEmployee2 = employees.maxBy(Employee::startYear)

    println(longestWorkingEmployee)
    println(shortestWorkingEmployee)
    println(shortestWorkingEmployee2)

    //accessing mutable object in lambdas expression
    var num = 10
    run {
        num += 15
        print(num)
    }

    //run
    val returnedValueUnit = run(::topLevelFunction)
    val returnedValueString = run(::topLevelFunction2)

    println(returnedValueUnit)
    println(returnedValueString)

}

fun topLevelFunction() = println("FUNCTION")
fun topLevelFunction2() : String = "Return Value"

fun useParameter(employees : List<Employee>, num: Int){
    employees.forEach {
        print(it.firstName)
        print(it)
    }
}

data class Employee (val firstName: String, val lastName: String, val startYear: Int){}