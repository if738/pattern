package com.spd.example

class SubtractStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a - b
    }
}