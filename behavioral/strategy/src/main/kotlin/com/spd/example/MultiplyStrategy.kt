package com.spd.example

class MultiplyStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a * b
    }
}