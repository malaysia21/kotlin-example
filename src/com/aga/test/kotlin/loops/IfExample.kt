package com.aga.test.example.loops

fun main(args: Array<String>) {
    val someCondition = true;

    var num = if (someCondition) {
        59
    } else {
        600
    }

    val num2 = if (someCondition) 59 else 600

    println(num)
    println(num2)
}