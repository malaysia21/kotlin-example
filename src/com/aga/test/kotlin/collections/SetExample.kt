package com.aga.test.example.collections

fun main(args: Array<String>) {

    //immutable set
    val stringSet = setOf("summer", "winter", "winter")
    println(stringSet.javaClass)
    println(stringSet)


    //mutable set
    val mutableStringSet = mutableSetOf("summer", "winter", "winter")
    println(mutableStringSet.javaClass)
    println(mutableStringSet)

    //printing set, not changing original collection
    val setInts = setOf(10, 55, 19, -23)
    println(setInts.plus(11))
    println(setInts.plus(11))
    println(setInts.minus(11))
    println(setInts.minus(100))

    println(setInts.average())

    //dropping first 3 elements
    println(setInts.drop(3))

    val mutableSetInts = mutableSetOf(10, 55, 19, -23)
    mutableSetInts.plus(11)
    println(mutableSetInts)
    mutableSetInts.add(60)
    println(mutableSetInts)
}