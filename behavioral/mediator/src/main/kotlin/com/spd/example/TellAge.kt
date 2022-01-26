package com.spd.example

class TellAge(var mediator: Mediator) : Component {

    override fun someTrigger() {
        mediator.send(this, getName())
    }


    override fun getName(): String {
        return "tellAge"
    }


}