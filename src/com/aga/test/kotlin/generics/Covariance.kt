package com.aga.test.kotlin.generics

fun main(args: Array<String>) {

    val shortList: List<Short> = listOf(1,2,3,4,5)
    convertToInt(shortList)
}

fun convertToInt(collection: List<Number>){
    for(num in collection){
        println("${num.toInt()}")
    }
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {
}

open class Flower{}
class Rose: Flower(){}

//only Flower accept - subclasses are not allow
//class Garden <T: Flower> {}

//covariant class
class Garden <out T: Flower> (val parameter: T) {
    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]

    fun plantFlower(flower: @UnsafeVariance T) = println("planting flower: $flower")


}