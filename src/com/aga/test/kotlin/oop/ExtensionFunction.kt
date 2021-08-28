package com.aga.test.kotlin.oop

fun main(args: Array<String>) {

    val str = "testing"
    println(UtilsFunction().upperFirstAndLast(str))
    println(str.upperFirstAndLast("test"))
}

fun String.upperFirstAndLast(param1: String): String {
    val upperFirst = this.substring(0,1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length-1) +  upperFirst.substring(upperFirst.length-1, upperFirst.length).toUpperCase()
}