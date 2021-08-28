package com.aga.test.kotlin.generics

import java.lang.Appendable

fun main(args: Array<String>) {
    val intsList = listOf(1, 2, 3, 4, 5)
    val shortsList: List<Short?> = listOf(10, 20, 30, 40, null)
    val floatList: List<Float?> = listOf(34.56f, 78.5f, 10.458f)
    val stringList: List<String> = listOf("2", "67")
    val anyLists: Any = listOf("2", "7")

    convertToInt(intsList)
    convertToInt(shortsList)
    convertToInt(floatList)

    append(StringBuilder("String1"), StringBuilder("String2"))

    printCollection(stringList)

    if (anyLists is List<*>) {
        println("List")
    }

    if(anyLists is List<*>)
    {
        val stringListFromAny = anyLists as List<String>
        println(stringListFromAny[1])
    }

}


fun <T: Any> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

//function with two upper bounds
fun <T> append(item1: T, item2: T) where T: CharSequence, T: Appendable
{
    println("Result is ${item1.append(item2)}")
}

fun <T: Number?> convertToInt(collection: List<T>){
    for(num in collection){
        println("${num?.toInt()}")
    }
}