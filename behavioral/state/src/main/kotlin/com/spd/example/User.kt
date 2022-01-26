package com.spd.example

import com.spd.example.sm.*

class User {

    private var state: State = GuestState(this)

    constructor(state: State) {
        this.state = state
    }

    constructor() {
    }

    fun printState() {
        println(state)
    }

    fun changeState(state: State) {
        this.state = state
    }

    fun register() {
        state.register()
    }

    fun confirmEmail() {
        state.confirmEmail()
    }

    fun activePremium() {
        state.activePremium()
    }

    fun deactivatePremium() {
        state.deactivatePremium()
    }

    fun banned() {
        state.banned()
    }

    fun unbanned() {
        state.unbanned()
    }

    fun readFreeContent() {
        println("you always can read free content")
    }

    fun sendMessage() {
        if (state is GuestState || state is RegisteredNotConfirmedState || state is BannedState) {
            println("Please register and confirm")
            return
        }
        println("you're able to send message")
    }

    fun readPremiumContent() {
        if (state is PremiumState) {
            println("You can read premium content")
            return
        }
        println("you're not able to read premium content")
    }

}