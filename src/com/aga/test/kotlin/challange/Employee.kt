@file:JvmName("KotlinStuff")

package com.aga.test.kotlin.challange


fun sayHelloToJava(name: String) {
    println("Calling Kotlin")
}

object Challenge {
   @JvmStatic fun doSomething(x: Int, y: Int) = (x+y) * (x-y)
}

class Employee (val firstName: String, val lastName: String, @JvmField var startYear: Int) {

    @JvmOverloads
    fun takesDefault(param1: String, param2: String = "default") {
        println("Param1: $param1, param2: $param2")
    }
}