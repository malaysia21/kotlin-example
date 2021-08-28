package com.aga.test.kotlin.challange

fun main(args: Array<String>) {

    val helloOne = "Hello"
    val helloTwo = "Hello"

    println("HelloOne is referentially equal to HelloTwo: ${helloOne === helloTwo}") //same string literal

    println("HelloOne is structurally equal to HelloTwo: ${helloOne == helloTwo}")

    var valueOne: Int = 2988
    val anyData: Any = "Any Type"

    if(anyData is String) {
        println(anyData.toUpperCase())
    }

    val stringData = """   1
        |  11
        | 111
        |1111""".trimMargin("|")
    println(stringData)


}