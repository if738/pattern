package com.spd.singleton.example

class SingletonLazy private constructor() {

    companion object {
        init {
            println("Lazy Singleton class invoked.")
        }

        private lateinit var instance: SingletonLazy

        fun getInstance(): SingletonLazy {
            return instance
        }
    }


}