package com.spd.service

import com.spd.example.factory.GreeceTrafficRulesFactory
import com.spd.example.factory.UkraineTrafficRulesFactory
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        println("GREECE")
        val greeceTrafficRulesFactory = GreeceTrafficRulesFactory()
        val basicRulesGreece = greeceTrafficRulesFactory.basicRules()
        val warningTrafficSignsGreece = greeceTrafficRulesFactory.warningTrafficSigns()
        val priorityTrafficSignsGreece = greeceTrafficRulesFactory.priorityTrafficSigns()
        println("antiradar price -" + basicRulesGreece.antiradarPrice())
        println("STOP ignore price -" + warningTrafficSignsGreece.getShapeByName("STOP"))
        println("is it critical violation -" + priorityTrafficSignsGreece.isItCriticalViolation("ANY"))

        println()

        println("UKRAINE")
        val ukraineTrafficSignsFactory = UkraineTrafficRulesFactory()
        val basicRulesUkraine = ukraineTrafficSignsFactory.basicRules()
        val warningTrafficSignsUkraine = ukraineTrafficSignsFactory.warningTrafficSigns()
        val priorityTrafficSignsUkraine = ukraineTrafficSignsFactory.priorityTrafficSigns()
        println("antiradar price -" + basicRulesUkraine.antiradarPrice())
        println("STOP ignore price -" + warningTrafficSignsUkraine.getShapeByName("STOP"))
        println("is it critical violation -" + priorityTrafficSignsUkraine.isItCriticalViolation("ANY"))
    }

}
