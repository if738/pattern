package com.spd.service

import com.spd.example.factory.BoatTransportFactory
import com.spd.example.factory.WarningTrafficSignsFactory
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {
        val boatTransportFactory = BoatTransportFactory()
        val boat = boatTransportFactory.create();
        val warningTrafficSignsFactory = WarningTrafficSignsFactory()
        val warnSigns = warningTrafficSignsFactory.create()
        val stop = warnSigns.getShapeByName("STOP")
        println(stop)
        val givingWay = warnSigns.getShapeByName("giving way")
        println(givingWay)
        println(boat.isItPassengerCar())

    }

}
