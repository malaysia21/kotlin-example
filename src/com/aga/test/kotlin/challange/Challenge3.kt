package com.aga.test.kotlin.challange

fun main(args: Array<String>) {
    val bicycle1 = Bicycle(150, 7, 70)
    bicycle1.printDescription()

    val mountainBicycle1 = MountainBike(140, 150, 7, 70)
    mountainBicycle1.printDescription()

    val roadBicycle1 = RoadBike(140, 150, 7, 70)
    roadBicycle1.printDescription()

    val bicycle2 = Bicycle(cadence = 150, speed = 70)
    bicycle2.printDescription()

    val mountainBicycle2 = MountainBike(140, 150, 70)
    mountainBicycle2.printDescription()

    val roadBicycle2 = RoadBike(140, 150, 70)
    roadBicycle2.printDescription()

    val bicycle3 = Bicycle("blue", 150, 7)
    bicycle3.printDescription()

    Bicycle.immutableColors.forEach { println(it)}

}


open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    companion object {
        val immutableColors = listOf("blue", "read", "white");
    }

    var color: String = "red"

    constructor(colorValue: String, cadence: Int, speed: Int, gear: Int = 20) : this (cadence, speed, gear){
        this.color = colorValue
        println("Color $color")
    }

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() =  println("Bike is in gear $gear, with a cadence of $cadence, travelling at the speed of $speed")
}

class MountainBike(var seatHeight: Int, cadence: Int, speed: Int,  gear: Int =10): Bicycle(cadence,speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("SeatHeight $seatHeight")
    }
}

class RoadBike(val tireWidth: Int, cadence: Int, speed: Int,  gear: Int = 10): Bicycle(cadence,speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("TireWidth $tireWidth")
    }
}