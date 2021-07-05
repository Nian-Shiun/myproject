package com.allen.student

fun main() {
    val stu = Student("Amy",66,88)
    stu.print()
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math +
        "\t" + (english+math)/2)
    }
}

