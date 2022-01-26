package com.spd.example

class ItemsDeliveryService : Publisher {

    private val subscribers: MutableList<Subscriber> = ArrayList()

    override fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    override fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    override fun notifySubscribers() {
     subscribers.forEach { it.update("Apples on sale") }
    }


}