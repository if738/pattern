package com.spd.example.command

import com.spd.example.Esp8266

class LightOffCommand(private val esp8266: Esp8266) :Command {
    override fun execute() {
        esp8266.lightOff()
    }
}