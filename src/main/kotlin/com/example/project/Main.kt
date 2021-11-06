package com.example.project

class Main {

    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {

    println(Main().greeting)
    print("2+2=" + Calculator().add(2, 2))

}
