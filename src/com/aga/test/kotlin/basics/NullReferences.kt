package com.aga.test.kotlin.basics

fun main(args: Array<String>) {
    val strOne: String? = "Not null"
    strOne?.let { printText(it) }

    val strTwo: String? = null

    println(strOne?.toUpperCase()) //NOT NULL
    println(strTwo?.toUpperCase()) //null
    println(strTwo?:"ELVIS OPERATOR".toUpperCase()) //ELVIS OPERATOR

    val something: Any = arrayOf(1,2,3)
    val sthType : String? = something as? String
    val sthType2  = something as? String
    println(sthType) // null
    println(sthType2) // null

    //not null assertion
    val strThree = strOne!!.toUpperCase()
    println(strThree)

    //equals with null is save operation
    val strSeven: String? = null
    val strEight = "Not null"
    println(strSeven == strEight)

    //array with null
    val nullableInts = arrayOfNulls<Int?>(5)
    nullableInts[3] = 4
    for(i in nullableInts){
        println(i)
    }
}

fun printText(text: String){
    println(text)
}