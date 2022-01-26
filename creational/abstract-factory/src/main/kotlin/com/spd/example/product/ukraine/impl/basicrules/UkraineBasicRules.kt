package com.spd.example.product.ukraine.impl.basicrules

import com.spd.example.product.BasicRules

class UkraineBasicRules: BasicRules {
    override fun isItRightHand(): Boolean {
        return true
    }

    override fun antiradarPrice(): String {
        return "850 UAH"
    }
}