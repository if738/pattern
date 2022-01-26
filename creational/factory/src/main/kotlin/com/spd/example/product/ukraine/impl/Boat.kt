package com.spd.example.product.ukraine.impl

import com.spd.example.product.Transport

class Boat : Transport {

    override fun isItPassengerCar(): Boolean {
        return false
    }
}