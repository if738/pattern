package com.spd.singleton.example

object KotlinSingleton {

    private var inc: Int = 0

    init {
        println("Kotlin Singleton class invoked.")
    }

    fun showMessage() {
        println("message $inc")
    }

    public fun inc() {
        inc += 1
    }

}