package com.spd.example

interface Publisher {

    fun subscribe(subscriber: Subscriber)
    fun unsubscribe(subscriber: Subscriber)
    fun notifySubscribers()

}