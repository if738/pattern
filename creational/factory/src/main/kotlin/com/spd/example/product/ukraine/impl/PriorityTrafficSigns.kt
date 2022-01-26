package com.spd.example.product.ukraine.impl

import com.spd.example.product.TrafficSigns

class PriorityTrafficSigns : TrafficSigns {

    override fun isItCriticalViolation(signName: String): Boolean {
        return true
    }

    override fun getShapeByName(signName: String): String {
        return "smth"
    }
}