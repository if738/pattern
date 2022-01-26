package com.spd.example

class SubTom : Subscriber {
    override fun update(context: String) {
        println("I Tom and I got message from publisher message=$context")
    }
}