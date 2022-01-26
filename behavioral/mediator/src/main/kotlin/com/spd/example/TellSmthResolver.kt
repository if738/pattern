package com.spd.example

class TellSmthResolver : Mediator {

    override fun send(component: Component, event: String) {
            println("mediator reacted on $event!")
    }

}