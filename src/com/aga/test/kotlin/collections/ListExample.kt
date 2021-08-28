package com.aga.test.example.collections

fun main(args: Array<String>) {

    //immutable list - class java.util.Arrays$ArrayList in java mutable
    val stringsList = listOf("spring", "summer", "fall", "winter")
    println(stringsList.javaClass)

    //empty list - class kotlin.collections.EmptyList
    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    //mutable list - class java.util.ArrayList
    val arrayList = arrayListOf(1,2,3)
    println(arrayList.javaClass)

    //mutable list - class java.util.ArrayList
    val mutableList = mutableListOf<Int>(1,2,3)
    println(mutableList.javaClass)
    println(mutableList[2])
    mutableList[1]=20
    println(mutableList)

    //string array to list
    val array = arrayOf("black", "white", "green")
    val colorList = array.toList()
    val colorList2 = listOf(*array)
    println(colorList)
    println(colorList2)

    //int array to list
    val ints = intArrayOf(1,2,3)
    println(ints.toList())
}