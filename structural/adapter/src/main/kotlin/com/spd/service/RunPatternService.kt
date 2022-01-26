package com.spd.service

import com.spd.example.BitfinexAdapter
import com.spd.example.BitfinexService
import com.spd.example.HuobiAdapter
import com.spd.example.HuobiService
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val huobiAdapter = HuobiAdapter(HuobiService())
        val bitfinexAdapter = BitfinexAdapter(BitfinexService())
        println(huobiAdapter.getExchangeRate())
        println(bitfinexAdapter.getExchangeRate())

    }

}
