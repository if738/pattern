package com.spd.example

class TrueNameIterator(var collection: SomeCollection) : Iterator {

    private var index: Int = 0

    override fun hasNext(): Boolean {
        return index < collection.findAllUsers().size
    }

    override fun next() : Any? {
        if (hasNext()) {
            val name = collection.data[index++]
            if (name.contains("user") && hasNext()) return next()
            return name
        }
        return null
    }

}