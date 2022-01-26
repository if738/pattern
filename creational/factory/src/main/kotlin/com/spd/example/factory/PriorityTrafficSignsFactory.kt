package com.spd.example.factory

import com.spd.example.product.TrafficSigns
import com.spd.example.product.ukraine.impl.PriorityTrafficSigns

class PriorityTrafficSignsFactory: TrafficSignsFactory {
    override fun create(): TrafficSigns {
        return PriorityTrafficSigns()
    }
}