package com.aga.test.kotlin.basics

import java.math.BigDecimal

fun main(args: Array<String>) {
    //array - initialize with arrayOf method
    val namesArray = arrayOf("John", "Jame", "Jill")
    val longsArray = arrayOf(1L, 2L)
    val longsArrayTwo = arrayOf<Long>(1, 2)

    println("Names array[2]: ${namesArray[2]}")

    //array - initialize with lambda expression
    val evenNumberArray = Array(16) { i-> i *2}
    for (number in evenNumberArray) {
        println(number)
    }
    val numberArray = Array(100000) {i -> i +1}
    val zeroArray = Array(100) {0}

    //array - without initialization
    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4)
    someArray = Array(6) {i -> (i+1)*10}

    //array with mixed type
    val mixedArray = arrayOf("Text", BigDecimal(10.5), 4, '1')
    for (element in mixedArray){
        println(element)
    }

    //primitive array class
    val intPrimitiveArray = intArrayOf(3,5,6,7)
    val dummyClass : DummyClass =
        DummyClass()
    dummyClass.printNumbers(intPrimitiveArray)

    //primitive array initialized only with size
    val intPrimitiveArrayTwo = IntArray(5)

    //converting between object and primitive arrays
    val intArrayConverted = intPrimitiveArray.toTypedArray()
    var toIntArray = evenNumberArray.toIntArray()

}