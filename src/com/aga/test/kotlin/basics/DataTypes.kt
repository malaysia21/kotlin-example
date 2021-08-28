package com.aga.test.kotlin.basics

fun main(args: Array<String>) {
    //Int
    val intOne = 10

    //Long
    var longOne = 23L
    val longTwo : Long = 23
    longOne = intOne.toLong()

    println("Long with literal: $longOne")
    println("Long converted from int type: $longTwo")

    //byte
    val byteOne: Byte = 111
    println("Byte: $byteOne")

    //short
    val shortOne: Short = byteOne.toShort()
    println("Short: $shortOne")

    //double
    val doubleOne = 23.56
    println("Double value:  $doubleOne - ${doubleOne is Double}")

    //float
    val floatOne = 23.56f
    println("Float value:  $floatOne - ${floatOne is Float}")

    //char
    val charOne = 'b'
    val charTwo: Char = 'c'
    val charInt = 65
    val charThree: Char = charInt.toChar()

    println("Char: $charOne")
    println("Char with type: $charTwo")
    println("Char converted from inf type: $charThree")

    //boolean
    val booleanOne = true
    val booleanTwo: Boolean = false
    println("Boolean: $booleanOne")
    println("Boolean with type: $booleanTwo")

    val isVacation = false
    val dummyClass: DummyClass =
        DummyClass()
    println(dummyClass.isVacationTime(isVacation))
    println(dummyClass.isVacationTimeSecond(isVacation))

    //Any
    val anyOne : Any

}