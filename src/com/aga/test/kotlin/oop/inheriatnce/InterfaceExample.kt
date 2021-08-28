package com.aga.test.kotlin.oop.inheriatnce

interface MyInterface {
    val number: Int;
    val number2: Int
        get() = 200;

    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {
    fun mySubFunction(num: Int): String
}

class MyClass : MySubInterface {
    override val number: Int = 100
    override val number2: Int = 100
    override fun mySubFunction(num: Int): String = num.toString()

    override fun myFunction(str: String): String {
        println(str)
        return str
    }

}