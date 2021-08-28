@file:JvmName("StaticCar")
package com.aga.test.kotlin.callingkotlin

import java.io.IOException


fun topLevelFunction() = println("Car file")

object SingletonObject {
    @JvmStatic fun doSomething() =  println("Method in singleton object")
}

class Car(color: String, val model:String, @JvmField val year: Int, val isAutomatic: Boolean) {

    companion object {
        const val constant = 25
        @JvmField val isAuto = false;
        @JvmStatic fun carCompanion() = println("Car companion object")
    }

    fun functionWithNotNullParameter(text: String) {
        print("Do not expect a null value : $text" )
    }

    @Throws(IOException::class)
    fun functionThrowingException() {
        throw IOException()
    }

    @JvmOverloads
    fun functionWithDefaultValues(str: String, num: Int = 25) {}

    var color : String = color
    set(value) {
        println("Not using $value")
        field = "always green"
    }

}

fun main(args: Array<String>) {
    "test".stringExtensionFunction()
}

fun String.stringExtensionFunction() {
    println(this)
}

