package com.spd.example.product.ukraine.impl.traffic

import com.spd.example.product.TrafficSigns

class UkrainePriorityTrafficSigns : TrafficSigns {

    override fun isItCriticalViolation(signName: String): Boolean {
        return false
    }

    override fun getShapeByName(signName: String): String {
        return "smth"
    }
}