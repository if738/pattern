package com.spd.example

class SomeCollection : Collection {

    var data: List<String> = listOf("user1", "user2", "user3", "user4", "user5", "Alex", "user7", "Smith")

    fun findAllUsers() : List<String>{
        return data
    }

    override fun getIterator(): Iterator {
        return TrueNameIterator(this)
    }

}