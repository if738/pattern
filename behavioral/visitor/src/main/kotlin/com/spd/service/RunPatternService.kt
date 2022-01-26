package com.spd.service

import com.spd.example.Anna
import com.spd.example.Jhon
import com.spd.example.ParseToStringVisitor
import com.spd.example.Tom
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {
        val parseToStringVisitor = ParseToStringVisitor()

        val anna = Anna()
        val jhon = Jhon()
        val tom = Tom()
        println(anna.accept(parseToStringVisitor))
        println(jhon.accept(parseToStringVisitor))
        println(tom.accept(parseToStringVisitor))
    }

}
