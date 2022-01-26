package com.spd.service

import com.spd.example.User
import com.spd.example.sm.GuestState
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val user = User()
        user.printState()
        user.register()
        user.printState()
        user.confirmEmail()

        println()
        user.readPremiumContent()
        user.readFreeContent()
        println()

        user.printState()
        user.activePremium()

        println()
        user.readPremiumContent()
        user.readFreeContent()
        println()

        user.printState()
        user.banned()
        user.printState()
        user.unbanned()
        user.printState()

    }

}
