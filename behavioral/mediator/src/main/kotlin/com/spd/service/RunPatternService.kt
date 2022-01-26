package com.spd.service

import com.spd.example.TellAge
import com.spd.example.TellName
import com.spd.example.TellSmthResolver
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {
        val tellAge = TellAge(TellSmthResolver())
        val tellName = TellName(TellSmthResolver())
        tellAge.someTrigger()
        tellName.someTrigger()
    }

}
