package com.spd.service

import com.spd.example.CompoundEntity
import com.spd.example.Entity
import com.spd.example.Item
import org.springframework.stereotype.Component
import java.math.BigDecimal
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val item1 = Item()
        val item100 = Item(BigDecimal(100))

        val compoundEntity1 = CompoundEntity()
        compoundEntity1.add(item1)
        compoundEntity1.add(item100)

        println("first compound")
        println(compoundEntity1.price())

        println()

        val compoundEntity2 = CompoundEntity()
        compoundEntity2.add(compoundEntity1)
        compoundEntity2.add(item1)
        compoundEntity2.add(item100)
        println("second compound")
        println(compoundEntity2.price())

        println()

        compoundEntity1.applyTax(1.5)
        println("first and second compound after tax apply")
        println(compoundEntity1.price())
        println(compoundEntity2.price())
    }

}
