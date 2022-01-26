package com.spd.example

import java.math.BigDecimal

class Item(private var price: BigDecimal = BigDecimal.ONE) : Entity {

    override fun price(): BigDecimal {
        return price
    }

    override fun applyTax(multiplier: Double) {
        val correctMultiplier: Double = if (multiplier > 1) multiplier else if (multiplier < 1 && multiplier > 0) {
            1 + multiplier
        } else 1.0
        price = price.multiply(BigDecimal(correctMultiplier))
    }

}