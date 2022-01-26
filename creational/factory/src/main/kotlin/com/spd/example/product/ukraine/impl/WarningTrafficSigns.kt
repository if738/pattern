package com.spd.example.product.ukraine.impl

import com.spd.example.product.TrafficSigns

class WarningTrafficSigns : TrafficSigns {

    override fun isItCriticalViolation(signName: String): Boolean {
        if (signName == "STOP") return true
        if (signName == "Parking not allowed") return false
        return false
    }

    override fun getShapeByName(signName: String): String {
        if (signName.lowercase() == "stop") return "hexagon"
        if (signName.lowercase() == "giving way") return "Inverted triangle"
        if (signName.lowercase() == "priority road") return "Inverted square"
        return ""
    }
}