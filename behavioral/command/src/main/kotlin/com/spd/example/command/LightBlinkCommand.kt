package com.spd.example.command

import com.spd.example.Esp8266

class LightBlinkCommand(private val esp8266: Esp8266) :Command {
    override fun execute() {
        for (i in 1..10){
        esp8266.lightOn()
        Thread.sleep(100)
        esp8266.lightOff()
        }
    }
}