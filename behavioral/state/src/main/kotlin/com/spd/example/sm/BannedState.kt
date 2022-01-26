package com.spd.example.sm

import com.spd.example.User

class BannedState(private val user: User) :State{

    override fun register() {

    }

    override fun confirmEmail() {

    }

    override fun activePremium() {

    }

    override fun deactivatePremium() {

    }

    override fun banned() {

    }

    override fun unbanned() {
        user.changeState(RegisteredState(user))
    }

}