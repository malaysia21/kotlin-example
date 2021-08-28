package com.aga.test.kotlin.basics

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return name == other.name && id == other.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}