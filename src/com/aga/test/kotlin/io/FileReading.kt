package com.aga.test.kotlin.io

import java.io.File

fun main(args: Array<String>) {

    //new.bin InputStreamReader(new.bin FileInputStreamReader(new.bin File("testFile.txt"), "UTF-8")

    //all lines to list
    val lines = File("testFile.txt").reader().readLines()
    lines.forEach {println (it)}

    //all lines to string
    val reader = File("testFile.txt").reader()
    val oneString = reader.readText();
    println(oneString)

    reader.close()

    //readText with use function, which close stream for us
    val lines2 = File("testFile.txt").reader().use { it.readText() }
    println(lines2)

    //example with bufferedReader
    val lines3 = File("testFile.txt").bufferedReader().use { it.readText() }
    println(lines3)

    val lines4 = File("testFile.txt").readText()
    println(lines4)

    //read each line separately
    File("testFile.txt").reader().forEachLine { println(it) }

}