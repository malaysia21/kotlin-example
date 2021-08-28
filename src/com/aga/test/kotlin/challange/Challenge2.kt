package com.aga.test.kotlin.challange

fun main(args: Array<String>) {

    //1. 2.
    val floatOne : Float? = -3847.384f
    val floatTwo : Float? = -3847.384f

    //3.
    val shortArray = Array<Short>(5) {i -> (i+1).toShort() }
    val shortArray2 = shortArrayOf(1,2,3,4,5)
    val shortArray3 : Array<Short> = arrayOf(1,2,3,4,5)

    //4.
    val intArray = Array<Int?>(40) {i -> (i+1)*5}

    //5
    val charPrimitiveArray = charArrayOf('a', 'b', 'c')
    val charPrimitiveArray2 = arrayOf<Char>('a', 'b', 'c').toCharArray()

    //6
    val x: String? = "UPPERCASE"
    val z = x?.toLowerCase() ?: "GIVE UP"
    println(z)

    //7
    x?.let { println(it.toLowerCase().replace('e','!'))}
    println(x)

    //8
    val nonNullVariable: Int? = null
    nonNullVariable!!.toDouble()
}

