package com.aga.test.example.loops

fun main(args: Array<String>) {
    //range
    val range = 1 .. 5
    val charRange = 'a' .. 'z'
    val stringRange = "ABC" .. "XYZ"

    val backwardRange = 5 downTo 1
    val stepRange = 3 .. 15
    val stepRangeThree = stepRange.step(3)
    val stepRangeReversed = stepRange.reversed()

    //verify range
    println (3 in range)
    println ('p' in charRange)
    println ("RST" in stringRange)
    println(5 in backwardRange)

    //loop through range
    for(a in range) {print(a)}

    println()

    for(a in stepRangeThree) {print(a)}

    println()

    for(a in stepRangeReversed) {print(a)}

    println()

    //Printed individual char character
    val string = "Hello"
    for(i in string) { print(i)}

    println()

    //Range with step
    for(num in 1..20 step 4){
        print(num)
    }

    println()

    //Range downTo with step
    for(num in 20 downTo 15 step 4){
        print(num)
    }

    println()

    //Exclude last number in range
    for(num in 1 until 10){
        print(num)
    }

    println()

    //Loop for array
    val seasons = arrayOf("spring", "summer", "fall", "winter")
    for (season in seasons) {println(season)}

    println("agnes" !in seasons)
    println("agnes" in seasons)
    println(32 !in 1..10)

    //Using index in array loop
    for (index in seasons.indices) {println("${seasons[index]} is season number $index")}

    //loop with lambda
    seasons.forEach { println(it) }
    seasons.forEachIndexed {index, value -> println("$value i season number $index")}
}