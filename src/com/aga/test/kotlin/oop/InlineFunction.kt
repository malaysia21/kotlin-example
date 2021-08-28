package com.aga.test.kotlin.oop

fun main(args: Array<String>) {

    println(labelMultiplyInline(2,5))
}

inline fun labelMultiplyInline(parameter1: Int, parameter2: Int, label: String = "RESULT: ") = "$label ${parameter1*parameter2}"
