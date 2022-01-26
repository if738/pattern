package com.spd.example.factory

import com.spd.example.product.Transport
import com.spd.example.product.ukraine.impl.Boat

class BoatTransportFactory :TransportFactory {
    override fun create(): Transport {
        return Boat()
    }
}