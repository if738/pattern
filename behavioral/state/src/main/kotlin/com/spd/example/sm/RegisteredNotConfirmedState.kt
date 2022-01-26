package com.spd.example.sm

import com.spd.example.User

class RegisteredNotConfirmedState(private val user: User) :State{

    override fun register() {

    }

    override fun confirmEmail() {
        user.changeState(RegisteredState(user))
    }

    override fun activePremium() {

    }

    override fun deactivatePremium() {

    }

    override fun banned() {
        user.changeState(BannedState(user))
    }

    override fun unbanned() {

    }

}