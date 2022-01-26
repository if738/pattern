package com.spd.example

import com.spd.example.command.Command

class RemoteController(private var command: Command) {

    @JvmName("setCommand1")
    fun setCommand(command: Command){
        this.command = command
    }

    fun triggerBlink() {
        command.execute()
    }

}