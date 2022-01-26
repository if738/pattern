package com.spd.example.factory

import com.spd.example.product.Transport

interface TransportFactory {

    fun create(): Transport

}