package com.ly.ch03

fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")

    val result1 = with(StringBuilder()) {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
    }
    println(result1)

    println("=========")

    val result2 = StringBuilder().run {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
    }
    println(result2)

    println("=========")

    val result3 = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
    }
    println(result3)
}

class Util {
    fun doAction1() {
        println("do action1")
    }

    companion object {
        // 静态方法：注解
        @JvmStatic
        fun doAction2() {
            println("do action2")
        }
    }
}