package com.aga.test.kotlin.challange

fun main(args: Array<String>) {

    //ranges
    val range = 5..5000 step 100
    range.forEach { println(it) }

    val range2 = -500..0 step 100
    range2.forEach { println(it) }

    var total: Int;
    var secondToLast = 0;
    var last = 1

    //Fibonacci sequence
    println(secondToLast)
    println(last)

    for (i in 1..13) {
        total = secondToLast + last;
        println(total)
        secondToLast = last
        last = total
    }

    //When expression
    val num = 100
    val dNum: Double =
        when {
            num > 100 -> -234.567
            num < 100 -> 4444.44
            else -> 0.0
        }
    println(dNum)
}