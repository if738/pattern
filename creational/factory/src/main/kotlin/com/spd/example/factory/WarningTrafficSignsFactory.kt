package com.spd.example.factory

import com.spd.example.product.TrafficSigns
import com.spd.example.product.ukraine.impl.WarningTrafficSigns

class WarningTrafficSignsFactory: TrafficSignsFactory {
    override fun create(): TrafficSigns {
        return WarningTrafficSigns()
    }
}