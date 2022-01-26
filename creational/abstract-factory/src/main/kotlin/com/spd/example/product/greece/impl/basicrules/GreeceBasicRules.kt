package com.spd.example.product.greece.impl.basicrules

import com.spd.example.product.BasicRules

class GreeceBasicRules: BasicRules {
    override fun isItRightHand(): Boolean {
        return true
    }

    override fun antiradarPrice(): String {
        return "2000 EURO"
    }
}