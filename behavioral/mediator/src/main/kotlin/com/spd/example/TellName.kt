package com.spd.example

class TellName(var mediator: Mediator) : Component {

    override fun someTrigger() {
        mediator.send(this, getName())
    }


    override fun getName(): String {
        return "tellName"
    }


}