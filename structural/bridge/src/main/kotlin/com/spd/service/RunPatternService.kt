package com.spd.service

import com.spd.example.db.impl.PostgresDS
import com.spd.example.service.ConcreteService
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val concreteService = ConcreteService(PostgresDS())
        val makeVeryHardJob = concreteService.makeVeryHardJob("222")
        println(makeVeryHardJob)

    }

}
