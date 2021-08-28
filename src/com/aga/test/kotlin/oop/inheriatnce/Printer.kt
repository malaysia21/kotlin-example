package com.aga.test.kotlin.oop.inheriatnce


fun main(args: Array<String>) {
 val lazyPrinter = LazyPrinter("UX", 15)
    lazyPrinter.printModel()
    lazyPrinter.sellingPrice()

    val sth = Something2("Sth", 10)
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("Model name of printer is $modelName")
    abstract fun sellingPrice(): Double
}

open class LazyPrinter(modelName: String, ppm: Int) : Printer(modelName) {
    final override fun printModel() = println("Model name of lazy printer is $modelName")
    override fun sellingPrice(): Double = 129.0
}

class LazyPrinterVersion2 : Printer {
    constructor(modelName: String): super(modelName)
    override fun sellingPrice(): Double = 150.0
}

class SpecialLaserPrinter(modelName: String, x: Int = 20) : LazyPrinter(modelName, x) {

}

open class Something (val x: Int) {
    private var property: String = "initProperty"

    constructor(propertyVal: String, y: Int): this(y){
        property = propertyVal
        println("Parent constructor")
    }
}

class Something2 : Something {

    constructor(property: String, z: Int) : super(property, z) {
        println("Child constructor")
    }
}

data class DataClass(val property: String) {

}