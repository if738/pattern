package com.spd.singleton.example

class SingletonEager private constructor(){

    init {
        println("Eager Singleton class invoked.")
    }

    companion object {
        private val instance: SingletonEager = SingletonEager()

        fun getInstance() : SingletonEager {
            return instance
        }
    }


}