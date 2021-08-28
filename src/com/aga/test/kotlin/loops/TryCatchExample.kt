package com.aga.test.kotlin.loops

fun main(args: Array<String>) {

    println(getNumber("1000"))
    //println(getNumber("1100--0")?: 10000)
    println(getNumber("1100--0")?: throw IllegalArgumentException("Unable to convert to Int"))

    getNumberNotImplementedYet("1000")
}


fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("Finally")
    }
}

fun getNumberNotImplementedYet(str: String) : Nothing {
    throw IllegalArgumentException("Not implemented yet")
}