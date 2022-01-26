package com.spd.example.product.greece.impl.traffic

import com.spd.example.product.TrafficSigns

class GreecePriorityTrafficSigns : TrafficSigns {

    override fun isItCriticalViolation(signName: String): Boolean {
        return true
    }

    override fun getShapeByName(signName: String): String {
        return "smth"
    }
}