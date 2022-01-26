package com.spd.service

import com.spd.example.RandomFacade
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {
        val randomFacade = RandomFacade()
        println(randomFacade.getResult())
    }

}
