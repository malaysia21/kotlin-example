package com.aga.test.kotlin.loops

import java.math.BigDecimal


enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {

    val num = 610

    //when - example
    when (num) {
        100, 600 -> println("100 or 600")
        200 -> println(200)
        300 -> println(300)
        in 301..500 -> println("in range 301..500")
        else -> println("Does not much anything")
    }

    //when - example with additional value
    val y = 10
    when (num) {
        y + 100, y + 600 -> println("110 or 600")
        y + 200 -> println(210)
        else -> println("Does not much anything")
    }

    //when - returning value
    val obj: Any = "String"
    val obj2: Any = BigDecimal(22.5)
    val obj3: Any = 45
    val something: Any = obj2

    val result = when (something) {
        is String -> {
            println(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 5}")
            3
        }
        else -> {println("Type of Any")
            4
        }
    }
    println("Result $result")

    //when with enum
    val season = Season.WINTER
    val  description = when (season) {
        Season.SPRING -> "Flowers"
        Season.SUMMER -> "Hot"
        Season.FALL -> "Coat"
        Season.WINTER -> "Cool"
    }

    println("$season - $description")

    //when as if function
    val num1 = 100
    val num2 = 200

    when {
        num1 > num2 -> println("Greater")
        num1 < num2 -> println("Less")
        else -> println("Equals")
    }
}