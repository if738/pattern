package com.spd.example.sm

import com.spd.example.User

class GuestState(private val user: User) :State{

    override fun register() {
        user.changeState(RegisteredNotConfirmedState(user))
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

    }

}