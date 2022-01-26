package com.spd.service

import com.spd.example.Context
import com.spd.example.MultiplyStrategy
import com.spd.example.SubtractStrategy
import com.spd.example.SumStrategy
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val context = Context(SumStrategy())

        println(context.executeStrategy(2, 3))
        context.strategy = SubtractStrategy()
        println(context.executeStrategy(2, 3))
        context.strategy = MultiplyStrategy()
        println(context.executeStrategy(2, 3))

    }

}
