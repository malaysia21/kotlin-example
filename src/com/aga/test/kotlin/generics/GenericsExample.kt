package com.aga.test.kotlin.generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mutableStringList: MutableList<String> = mutableListOf("hello")
    mutableStringList.add("goodbye")
    printCollection(mutableStringList)
    mutableStringList.printCollectionWithExtensionFunction()

    val bigDecimalMutableList = mutableListOf(BigDecimal(-36.25), BigDecimal(45.88))
    printCollection(bigDecimalMutableList)
    bigDecimalMutableList.printCollectionWithExtensionFunction()

}

//accept any type of list
fun <T> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

//same function with extension function in list
fun <T> List<T>.printCollectionWithExtensionFunction() {
    for (item in this) {
        println(item)
    }
}