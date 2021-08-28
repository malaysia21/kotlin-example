package com.aga.test.kotlin.collections

fun main(args: Array<String>) {

    //immutable list
    val strings = listOf<String>("spring", "summer", "fall", "winter", "summer")
    val colors = listOf("black", "white", "red", "red")
    val ints = listOf(1,2,4,6,8)

    //mutable list
    val mutableSeason = strings.toMutableList()
    mutableSeason.add("summer3")
    println(mutableSeason)

    println(strings.last())
    println(strings.reversed())
    println(strings.getOrNull(5))
    println(strings.getOrElse(5) {"spring"})

    println(ints.max())

    //pair element from each list
    println(colors.zip(strings))

    //merging two list, in result list of lists
    val mergeList = listOf(colors, strings)
    println(mergeList)

    //concatenation of two list
    val combineList = colors + strings
    println(combineList)

    //concatenation of two list without duplicates
    val noDuplicateList = colors.union(strings)
    println(noDuplicateList)

    //removing duplicates
    val noDuplicatesColorList = colors.distinct()
    println(noDuplicatesColorList)

}

