package com.aga.test.kotlin.challange

fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)


    val (fName, lName, age ) = joe
    println("fName=$fName, lName=$lName, age = $age")

    val immutablePeopleMap = mapOf<String, Person>(
        joe.lastName to joe,
        jane.lastName to jane,
        mary.lastName to mary,
        john.lastName to john
    )
    println(immutablePeopleMap)

    println(immutablePeopleMap.filter { it.key.startsWith('S') }.count())

    println(immutablePeopleMap.map { Pair(it.value.firstName, it.value.lastName) }.toList())

    immutablePeopleMap.also {
        it.map {
            println("${it.value.firstName} is ${it.value.age} years old")
        }
    }

    val list1 = listOf(1, 4, 9, 15, 43)
    val list2 = listOf(4, 55, -83, 15, 22, 101)

    println(list1.filter { list2.contains(it) })

    var regularPaper = Box<Regular>()
    var premiumPaper = Box<Premium>()
    var paper = Box<Paper>()
     paper = regularPaper
     paper = premiumPaper
    //regularPaper = paper
}


class Person (val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}

class Box<out T >{}

open class Paper() {}

class Regular: Paper(){}
class Premium: Paper(){}