package com.aga.test.kotlin.generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList = listOf("String", 111, BigDecimal(344.6))
    val bigDecimalOnly = getElementsOfType<BigDecimal>(mixedList)
    println(bigDecimalOnly)

}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    val newList: MutableList<T> = mutableListOf()
    for( element in list){
        if(element is T) {
            newList.add(element)
        }
    }

    return newList
}