package com.example.project

class Main {

    val greeting: String
        get() {
            return "Hello World!"
        }

    //this is only needed to be able to launch it from terminal
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            main()
        }

    }

}

fun main() {

    println(Main().greeting)
    print("2+2=" + Calculator().add(2, 2))

}
