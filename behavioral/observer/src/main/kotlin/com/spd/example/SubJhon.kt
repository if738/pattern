package com.spd.example

class SubJhon : Subscriber {
    override fun update(context: String) {
        println("I Jhon and I got message from publisher message=$context")
    }
}