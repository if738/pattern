package com.spd.example

class SumStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a + b
    }
}