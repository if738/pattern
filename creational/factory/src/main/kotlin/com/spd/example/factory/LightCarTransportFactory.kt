package com.spd.example.factory

import com.spd.example.product.Transport
import com.spd.example.product.ukraine.impl.LightCar

class LightCarTransportFactory : TransportFactory {
    override fun create(): Transport {
        return LightCar()
    }
}