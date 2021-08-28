package com.aga.test.kotlin.oop.inheriatnce

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunication.getTabLine())
    println(CompanyCommunication.getCopyrightLine())
}

object CompanyCommunication {
    val currentYear = Year.now();

    fun getTabLine() = "Company"
    fun getCopyrightLine() = "Company Copyright - $currentYear"
}