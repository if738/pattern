package com.spd.example

import java.math.BigDecimal

interface  Entity {
    fun price(): BigDecimal
    fun applyTax(multiplier: Double)
}