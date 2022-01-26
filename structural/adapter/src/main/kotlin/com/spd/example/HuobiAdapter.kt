package com.spd.example

class HuobiAdapter(val huobiService: HuobiService): Exchange {

    override fun getExchangeRate(): String {
        return huobiService.getHuobiServiceDataFromAPI().replace("huobi ","")
    }

}