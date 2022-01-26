package com.spd.example

class Context(var strategy: Strategy) {

    fun executeStrategy(a: Int, b: Int): Int {
        return strategy.execute(a, b)
    }

}