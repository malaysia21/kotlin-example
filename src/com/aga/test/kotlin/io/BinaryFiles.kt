package com.aga.test.kotlin.io

import java.io.DataInputStream
import java.io.EOFException
import java.io.File
import java.io.FileInputStream

fun main(args: Array<String>) {

    File("new.bin").writeBytes(byteArrayOf(56, 78, 122,33))

    val file = DataInputStream(FileInputStream("new.bin"))

    try {
        while(true) {
            val redByte = file.readByte()
            println(redByte)
        }
    } catch (e: EOFException) {
        println(e.message)
    }

    //try-with-resource
}