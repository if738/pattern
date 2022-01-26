package com.spd.service

import com.spd.example.Esp8266
import com.spd.example.RemoteController
import com.spd.example.command.LightBlinkCommand
import com.spd.example.command.LightOffCommand
import com.spd.example.command.LightOnCommand
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    //TODO roughly, we can run Receiver instead using business logic in Command

    @PostConstruct
    fun runIt() {
        val esp8266 = Esp8266()
        val remoteController = RemoteController(LightOnCommand(esp8266))
        remoteController.triggerBlink()
        remoteController.setCommand(LightOffCommand(esp8266))
        remoteController.triggerBlink()
//        remoteController.setCommand(LightBlinkCommand(esp8266))
//        remoteController.triggerBlink()
    }

}
