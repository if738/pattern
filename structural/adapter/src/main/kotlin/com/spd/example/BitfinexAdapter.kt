package com.spd.example

class BitfinexAdapter(val bitfinexService: BitfinexService): Exchange {
    override fun getExchangeRate(): String {
        return bitfinexService.getBitfinexServiceDataFromAPI().replace("bitfinex ","")
    }
}