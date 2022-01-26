package com.spd.example.factory

import com.spd.example.product.TrafficSigns

interface TrafficSignsFactory {

    fun create(): TrafficSigns

}