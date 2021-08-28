package com.aga.test.kotlin.oop.inheriatnce


fun main(args: Array<String>) {
    SomeClass.Companion.accessPrivateVar()
    SomeClass.accessPrivateVar();

    val someClass = SomeClass.assign("TEST")
    val someClass2 = SomeClass.assignWithLowerOrUpper("test", false)
    println(someClass)
    println(someClass2)

    var mutableProperty: Int = 100

    someFunctionWithInterface(object : SomeInterface {
        override fun functionInInterface(num: Int): String {
           return "Override functionInInterface ${num *mutableProperty}"
        }
    })
}

class SomeClass private constructor(val someString: String) {

    companion object {
        private var privateVar = 6

        fun accessPrivateVar() {
            println("Accessing private var $privateVar")
        }

        fun assign(str: String) = SomeClass(str)
        fun assignWithLowerOrUpper(str: String, lowercase : Boolean) : SomeClass {
            return if(lowercase) {
                SomeClass(str.toLowerCase())
            } else {
                SomeClass(str.toUpperCase())
            }
        }
    }
}

interface SomeInterface {

    fun functionInInterface(num: Int): String
}

fun someFunctionWithInterface(someInt: SomeInterface) {
    println("Function with interface ${someInt.functionInInterface(20)}")
}